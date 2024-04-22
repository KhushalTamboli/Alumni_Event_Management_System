package Alumni_Ms_Service;

import java.util.List;

import Alumni_Ms_Model.Alumni_Model;
import Alumni_Ms_Model.Event_Model;
import Alumni_Ms_Repository.Event_Repository;
//------------------Add Event-------------------------------
public class Event_Service {
	Event_Repository er = new Event_Repository();
	public int isAddEvent(Event_Model eModel)
	{
		if(er.isAddEvent(eModel))
		{
			return 1;
		}else 
			return 0;
	}
//------------------Show Event-------------------------------
	public List<Event_Model> getAllEvent()
	{
		 return er.getAllEvent();
	}
//------------------Event Attendance-------------------------------
	public int takeAttendence(String aName,String eName)
	{
		if(er.takeAttendence(aName, eName))
			return 1;
		else 
			return 0;
	}
	public void AllPresentAlumni(String eName)
	{
		er.AllPresentAlumni(eName);
	}
	public void AllAbsentAlumni()
	{
		er.AllAbsentAlumni();
	}
}
