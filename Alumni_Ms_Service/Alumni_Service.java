package Alumni_Ms_Service;

import java.util.List;

import Alumni_Ms_Model.Alumni_Model;
import Alumni_Ms_Repository.Alumni_Repository;

public class Alumni_Service {
	
	Alumni_Repository ar = new Alumni_Repository();
	
//------------------Add data Alumni-------------------------------
	public int isAddAlumni(Alumni_Model aModel)
	{
		if(ar.isAddAlumni(aModel))
			return 1;
		else
			return 0;
	}
//------------------Show data Alumni-------------------------------
	public List<Alumni_Model> getAllAlumni()
	{
		 return ar.getAllAlumni();
	}
//------------------Delete data Alumni-------------------------------
	public int deleteAlumni(String aName)
	{
		if(ar.deleteAlumni(aName))
			return 1;
		else
			return 0;
	}
//------------------Search data Alumni-------------------------------
	public int searchAlumni(String aName)
	{
		if(ar.searchAlumni(aName))
			return 1;
		else
			return 0;
	}
}
