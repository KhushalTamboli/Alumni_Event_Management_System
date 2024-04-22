package Alumni_Ms_Repository;

import java.util.ArrayList;
import java.util.List;

import Alumni_Ms_Model.Alumni_Model;
public class Alumni_Repository {
	static List<Alumni_Model> Alist = new ArrayList<>();

//------------------Add data Alumni-------------------------------
 	public boolean isAddAlumni(Alumni_Model aModel)
	{
 		if(Alist.add(aModel))
 			return true;
 		else
 			return false;
	}
//------------------Show data Alumni-------------------------------
 	public List<Alumni_Model> getAllAlumni()
 	{
 			return Alist;
 	}
//------------------Delete data Alumni-------------------------------
 	public boolean deleteAlumni(String aName)
 	{
 		for(Alumni_Model list : Alist)
 		{
 			if(list.getaName().equalsIgnoreCase(aName))
 			{
 				Alist.remove(list);
 				return true;
 			}
 		}
 	return false;
 	}
//------------------Search data Alumni-------------------------------
 	public boolean searchAlumni(String aName)
 	{
 		for(Alumni_Model list : Alist)
 		{
 			if(list.getaName().equalsIgnoreCase(aName))
 			{
 				System.out.println(list.getAid()+"\t"+list.getaName()+"\t"+list.getaEmail()+"\t"+list.getaMob()+"\t"+list.getaAddress()+"\t"+list.getPass_year());
 				return true;
 			}
 		}
 		return false;
 	}
//------------------attendance Alumni-------------------------------
 	public boolean isAlumniPresent(String aName)
 	{
 		boolean flag;
 		for(Alumni_Model am : Alist)
 		{
 			if(am.getaName().equalsIgnoreCase(aName))
 			{
 				return true;
 			}
 		}
 		return false;
 	}
 	public List<Alumni_Model> getAlumni()
 	{
 		return Alist;
 	}
}
