package Alumni_Ms_Repository;

import java.util.ArrayList;
import java.util.List;

import Alumni_Ms_Model.Alumni_Model;
import Alumni_Ms_Model.Event_Model;
import Alumni_Ms_Model.attendenceModel;

public class Event_Repository {
	
	List<Event_Model> Elist = new ArrayList<>();
	static List<attendenceModel> Attendencelist = new ArrayList<>();
	
	Alumni_Repository ar = new Alumni_Repository();
//------------------Add Event-------------------------------
	public boolean isAddEvent(Event_Model eModel)
	{
		if(Elist.add(eModel))
		{
			return true;
		}else
			return false;
	}
//------------------Show Event-------------------------------
	public List<Event_Model> getAllEvent()
 	{
 			return Elist;
 	}
//------------------Attendance-------------------------------
	public boolean takeAttendence(String aName,String eName)
	{
		if(ar.isAlumniPresent(aName)) {
			attendenceModel atModel = new attendenceModel(aName,eName);
			Attendencelist.add(atModel);
			return true;
		}
		else
		{
			System.out.println("Alumni is Not Present");
			return false;
		}
	}
	public void AllPresentAlumni(String eName)
	{
			List<Alumni_Model> aModel = ar.getAllAlumni();
			
			for(attendenceModel atModel :Attendencelist )
			{
				for(Alumni_Model am : aModel)
				{
					if(atModel.getaName().equalsIgnoreCase(am.getaName()) && atModel.geteName().equalsIgnoreCase(eName))
					{
						System.out.println("------------");
						System.out.println(am.getAid()+"\t"+am.getaName()+"\t"+am.getaEmail()+"\t"+am.getaBranch()+"\t"+am.getPass_year());
						am.setStatus(true);
					}
				}
			}
	}
	public void AllAbsentAlumni()
	{
			List<Alumni_Model> aModel = ar.getAllAlumni();

				for(Alumni_Model am : aModel)
				{
						if(am.isStatus()==false)
						{
							System.out.println("------------");
							System.out.println(am.getAid()+"\t"+am.getaName()+"\t"+am.getaEmail()+"\t"+am.getaBranch()+"\t"+am.getPass_year());
						}
				}
				
				for(Alumni_Model am : aModel)
				{
					am.setStatus(false);
				}
			
	}
	
}
