package Alumni_Ms_Client;

import java.util.*;

import Alumni_Ms_Model.Alumni_Model;
import Alumni_Ms_Model.Event_Model;
import Alumni_Ms_Service.Alumni_Service;
import Alumni_Ms_Service.Event_Service;

public class Alumni_Ms_Client_App {

	public static void main(String[] args) 
	{
		Scanner k = new Scanner(System.in);
		boolean flag = true;
		int choice;
		Alumni_Service as = new Alumni_Service();
		Event_Service es = new Event_Service();
		do
		{
			System.out.println("==================================");
			System.out.println("1. Add New Alumni/view/delete/search/update:");
			System.out.println("2. Add Event");
			System.out.println("3. Take Attendance of Allumni Those Are Present In Alumni Meet");
			System.out.println("4. All Present Alumni in Event: ");
			System.out.println("5. All Absent Alumni in Event: ");
			System.out.println("==================================");
			System.out.println("Enter Your Choice:");
			choice=k.nextInt();
			System.out.println("==================================");
			
			switch(choice)
			{
			case 1:
				k.nextLine();
				do {
					System.out.println("==================================");
					System.out.println("1. Add New Alumni:");
					System.out.println("2. Display Alumni Data:");
					System.out.println("3. Delete Alumni Data:");
					System.out.println("4. search Alumni Data:");
					System.out.println("5. Mean Menu");
					System.out.println("==================================");
					System.out.println("Enter your choice : ");
					int ch = k.nextInt();
					System.out.println("==================================");
					switch(ch)
					{
//------------------------------------------------------------------------------------------------
						case 1: // add alumni
						
							k.nextLine();
							System.out.println("Enter The Alumni Batch Year:");
							String passout_year = k.nextLine();
							System.out.println("Enter Alumni Id:");
							int Aid = k.nextInt();
							k.nextLine();
							System.out.println("Enter Alumni Name:");
							String aName = k.nextLine();
							System.out.println("Enter Alumni Email:");
							String aEmail = k.nextLine();
							System.out.println("Enter The Alumni Mobile Number:");
							String aMob = k.nextLine();
							System.out.println("Enter Alumni Address:");
							String aAddress = k.nextLine();
							System.out.println("Enter Alumni Branch:");
							String aBranch = k.nextLine();
							
							Alumni_Model aModel = new Alumni_Model(Aid,aName,aEmail,aMob,aAddress,passout_year,aBranch);
							
							int result = as.isAddAlumni(aModel);
							if(result==1)
								System.out.println("Alumni Added");
							else
								System.out.println("Alumni Not Added");
							break;
							
						case 2: // To View Alumni
							
							k.nextLine();
							List<Alumni_Model> list = as.getAllAlumni();
							if(list.size()>0)
							{
								for(Alumni_Model obj : list)
								{
									System.out.println(obj.getAid()+"\t"+obj.getaName()+"\t"+obj.getaEmail()+"\t"+obj.getaMob()+"\t"+obj.getaAddress()+"\t"+obj.getPass_year());
								}	
							}
							else
								System.out.println("Alumni Not Present...");
							break;
				
						case 3: // delete alumni
							
							k.nextLine();
							System.out.println("Enter the Name of Alumni : ");
							aName = k.nextLine();
							result = as.deleteAlumni(aName);
							if(result==1)
								System.out.println("Deleted...");
							else
								System.out.println("Wrong Input...");
							break;
							
						case 4: // search alumni data
							k.nextLine();
							System.out.println("Enter the Name For Searching Alumni:");
							aName = k.nextLine();
							result = as.searchAlumni(aName);
							
						default : 
							flag = false;
					}
				}while(flag);
				break;
//-----------------------------------------------------------------------------------------------------------------
			case 2:
				k.nextLine();
				flag=true;
				do {
					System.out.println("==================================");
					System.out.println("1. Add Event");
					System.out.println("2. View Events");
					System.out.println("3. Mean Menu");
					System.out.println("==================================");
					System.out.println("Enter your choice : ");
					int ch = k.nextInt();
					System.out.println("==================================");
					switch(ch)
					{
					case 1:
						k.nextLine();
						System.out.println("Enter the Events Name:");
						String eName = k.nextLine();
						System.out.println("Enter the Events Date:");
						String eDate = k.nextLine();
						System.out.println("Enter the  Events Vanue:");
						String eVanue = k.nextLine();
						System.out.println("Enter the Events Description:");
						String eDesc = k.nextLine();
						Event_Model eModel = new Event_Model(eName,eDate,eVanue,eDesc);
						int result = es.isAddEvent(eModel);
						if(result==1)
							System.out.println("Event Added...");
						else
							System.out.println("Event Not Added...");
						break;
						
					case 2:
						k.nextLine();
						List<Event_Model> list = es.getAllEvent();
						if(list.size()>0)
						{
							for(Event_Model obj : list)
							{
								System.out.println(obj.geteName()+"\t"+obj.geteDate()+"\t"+obj.geteVanue()+"\t"+obj.geteDesc());
							}	
						}
						else
							System.out.println("Event Not Present...");
						break;
					default :
						flag=false;
					}
				}while(flag);
				break;
//------------------------------------------------------------------------------------------------
			case 3:
				k.nextLine();
				System.out.println("Enter Event Name:");
				String eName = k.nextLine();
				flag=true;
				do
				{
					System.out.println("1. Enter  Alumni Name:");
					System.out.println("2. Go To Main Menu:");
					
					System.out.println("Enter Your Choice:");
					int Choice=k.nextInt();
					
					switch(Choice)
					{
					case 1:
						k.nextLine();
						System.out.println("Enter  Alumni Name:");
						String aName=k.nextLine();
						int result= es.takeAttendence(aName,eName);
						if(result==1)
							System.out.println("Attendence Marked...");
						else
							System.out.println("Some Problem is there ...");
					break;
					default :
						flag = false;
					}
				}while(flag);
				break;
//--------------------------------------------------------------------------------------------
			case 4:
				k.nextLine();
				System.out.println("Enetr Event Name  : ");
				eName = k.nextLine();
				es.AllPresentAlumni(eName);
				break;
//--------------------------------------------------------------------------------------------
//			case 5:
//				
//				es.AllAbsentAlumni();
//				
//			default:
//				break;
			}
			
		}while(true);
	}
}
