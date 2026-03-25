package Employee1;
import Datevalid.ConsoleInput;
import org.LinkedList.*;
public class Program {
	public static void main(String[] args) {
		int choice = 0;
		final int MENU_ADD = 1;
		final int MENU_DISPLAY = 2;
		final int MENU_SORT = 3;
		final int MENU_EXIT = 4;

		LinkedList objList = new LinkedList();
		
		int indexEmployee = 0;

		do {
			System.out.println("1. Add");
			System.out.println("2. Display");
			System.out.println("3. Sort");
			System.out.println("4. Exit");

			choice = ConsoleInput.getInt();

			switch(choice) {
              // Add
			case MENU_ADD:
			{
				int subChoice = 0;
				do {
					System.out.println("1. Manager");
					System.out.println("2. Engineer");
					System.out.println("3. SalesPerson");
					System.out.println("4. Exit");

					subChoice = ConsoleInput.getInt();
					if(subChoice == 4) break;

					System.out.println("Enter Name ");
					String name = ConsoleInput.getString();

					System.out.println("Enter Address ");
					String address = ConsoleInput.getString();

					System.out.println("Enter Age ");
					int age = ConsoleInput.getInt();

					System.out.println("Enter Gender ");
					char gender = ConsoleInput.getChar();

					System.out.println("Enter Basic Salary ");
					int basicSalary = ConsoleInput.getInt();

					switch(subChoice) {

					case 1:
						// input for manager
						System.out.println("Enter the hra ");
						float hra = ConsoleInput.getFloat();
						Manager objManager = new Manager(name, address, age, gender, basicSalary, hra);
						objList.add(objManager);
						break;

					case 2:
						// input for Engineer
						System.out.println("Enter the over time ");
						float overTime = ConsoleInput.getFloat();
						Engineer objEngineer= new Engineer(name, address, age, gender, basicSalary, overTime);
						objList.add(objEngineer);
						break;

					case 3:
						//input for Salesperson
						System.out.println("Enter the commision ");
						int commision = ConsoleInput.getInt();
						Salesperson objSalesperson= new Salesperson(name, address, age, gender, basicSalary, commision);
						objList.add(objSalesperson);
						break;
					}

				} while (subChoice != 4);

				break;
			}

			// Display 
			case MENU_DISPLAY:
			{
				int subChoice = 0;
				do {
					System.out.println("1. All");
					System.out.println("2. First");
					System.out.println("3. Next");
					System.out.println("4. Previous");
					System.out.println("5. Last");
					System.out.println("6. Exit");
					System.out.println("Enter Choice");

					subChoice = ConsoleInput.getInt();

					switch (subChoice) {

					case 1:{ 
						Object Data = objList.getFirst();
						while(Data != null) {
							display((Employee) Data);
			                Data = objList.getNext();

						}
					}
						break;

					case 2:{ 
						Object Data= objList.getFirst();
			            if (Data != null)
			                display((Employee) Data);
					}
					  break;

					case 3:
					{           
						Object Data = objList.getNext();
						if(Data != null)
						{
							display((Employee) Data);
						}
						else {
							System.out.println("No Next Element");
						}
					}
						break;

					case 4:
					{
						Object Data = objList.getPrevious();
						if(Data != null) {
							display((Employee) Data);
						}
						else {
							System.out.println("No Previous Element");
						}
						
					}
						break;

					case 5:
					{
				         Object Data = objList.getLast();
				         if(Data != null) {
				        	 display((Employee) Data);
				         }	
					}break;
					
					}
				} while (subChoice != 6);
			      break;
			}
			// Sort
			case MENU_SORT:
			{ 
				int subChoice;
				do {
					System.out.println("1. All Managers");
					System.out.println("2. All Engineers");
					System.out.println("3. All Salesperson");
					System.out.println("4. By Name Ascending");
					System.out.println("5. By Name Descending");
					System.out.println("6. Exit");
					System.out.println("Enter Choice");
					subChoice = ConsoleInput.getInt();
					switch(subChoice) {
					
					case 1:
					{  // Manager
					    Node temp = objList.getStart();

					    while (temp != null) {
					        if (temp.data instanceof Manager) {
					            display((Employee) temp.data);
					        }
					        temp = temp.next;
					    }
					}
					break;
					case 2:
					{   // Engineer
					    Node temp = objList.getStart();

					    while (temp != null) {
					        if (temp.data instanceof Engineer) {
					            display((Employee) temp.data);
					        }
					        temp = temp.next;
					    }
					}
					break;
					case 3:
					{        //Salesperson
					    Node temp = objList.getStart();

					    while (temp != null) {
					        if (temp.data instanceof Salesperson) {
					            display((Employee) temp.data);
					        }
					        temp = temp.next;
					    }
					}
					break;
				     case 4 :    // Ascending by name
					{
						Node iTmp = objList.getStart();

						while (iTmp != null) {

						    Node jTmp = objList.getStart();

						    while (jTmp.next != null) {

						        Employee e1 = (Employee) jTmp.data;
						        Employee e2 = (Employee) jTmp.next.data;

						        if (compareString(e1.getName(), e2.getName())>0) {
						            Object temp = jTmp.data;
						            jTmp.data = jTmp.next.data;
						            jTmp.next.data = temp;
						        }
						        jTmp = jTmp.next;
						    }
						    iTmp = iTmp.next;
						}
					}
					break;
					
				     case 5:
				     {        //Descending by name
							Node iTmp = objList.getStart();

							while (iTmp != null) {

							    Node jTmp = objList.getStart();

							    while (jTmp.next != null) {

							        Employee e1 = (Employee) jTmp.data;
							        Employee e2 = (Employee) jTmp.next.data;

							        if (compareString(e1.getName(), e2.getName())<0) {
							            Object temp = jTmp.data;
							            jTmp.data = jTmp.next.data;
							            jTmp.next.data = temp;
							        }
							        jTmp = jTmp.next;
							    }
							    iTmp = iTmp.next;
							}
						}
						break;
				     case 6:
				  
				     break;
					}
				}while(subChoice!=6);
			}
			break;
			
			case MENU_EXIT :
				System.out.println("Exiting Successfully");
				break;

			}

		} while(choice != 4); 
	}

	
	static void display(Employee e) {
		System.out.println("\nName: " + e.getName());
		System.out.println("Address: " + e.getAddress());
		System.out.println("Age: " + e.getAge());
		System.out.println("Gender: " + e.getGender());
		System.out.println("Basic: " + e.getBasicSalary());
		System.out.println("Total Salary: " + e.CalculateSalary());

		if (e instanceof Manager)
			System.out.println("HRA: " + ((Manager) e).getHra());
		else if (e instanceof Engineer)
			System.out.println("Overtime: " + ((Engineer) e).getOverTime());
		else
			System.out.println("Commission: " + ((Salesperson) e).getCommision());
	}
	// for comparing to string
	static int compareString(String a, String b) {
	    int i = 0;
	    while (i < a.length() && i < b.length()) {

	        char c1 = a.charAt(i);
	        char c2 = b.charAt(i);

	        if (c1 != c2) {
	            return c1 - c2;
	        }
	        i++;
	    }
	    return a.length() - b.length();
	}
}