package Employee;
import Datevalid.ConsoleInput;

public class Program {

	public static void main(String[] args) {
		int choice = 0;
		final int MENU_ADD = 1;
		final int MENU_DISPLAY = 2;
		final int MENU_SORT = 3;
		final int MENU_EXIT = 4;

		Employee [] arrEmployee = new Employee[100];
		int indexEmployee = 0;
        int current = 0;

		do {
			System.out.println("1. Add");
			System.out.println("2. Display");
			System.out.println("3. Sort");
			System.out.println("4. Exit");

			choice = ConsoleInput.getInt();

			switch(choice) {

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
					byte gender = ConsoleInput.getByte();

					System.out.println("Enter Basic Salary ");
					int basicSalary = ConsoleInput.getInt();

					switch(subChoice) {

					case 1:
						// input for manager
						System.out.println("Enter the hra ");
						float hra = ConsoleInput.getFloat();
						arrEmployee[indexEmployee++] = new Manager(name, address, age, gender, basicSalary, hra);
						break;

					case 2:
						// input for Engineer
						System.out.println("Enter the over time ");
						float overTime = ConsoleInput.getFloat();
						arrEmployee[indexEmployee++] = new Engineer(name, address, age, gender, basicSalary, overTime);
						break;

					case 3:
						//input for Salesperson
						System.out.println("Enter the commision ");
						int commision = ConsoleInput.getInt();
						arrEmployee[indexEmployee++] = new Salesperson(name, address, age, gender, basicSalary, commision);
						break;
					}

				} while (subChoice != 4);

				break;
			}

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

					case 1:
						for (int i = 0; i < indexEmployee; i++)
							display(arrEmployee[i]);
						break;

					case 2:
						current = 0;
						display(arrEmployee[current]);
						break;

					case 3:
						if (current < indexEmployee - 1) {
							current++;
						}
						display(arrEmployee[current]);
						break;

					case 4:
						if (current > 0) 
							{
							current--;
							}
						display(arrEmployee[current]);
						break;

					case 5:
						current = indexEmployee - 1;
						display(arrEmployee[current]);
						break;
					}

				} while (subChoice != 6);
				break;
			}
			case MENU_SORT:
			{ 
				int subChoice;
				do {
					System.out.println("1. All Managers");
					System.out.println("2. All Engineers");
					System.out.println("3. All Salesperson");
					System.out.println("4. By Name Ascending");
					System.out.println("5. By Name Descending");
					System.out.println("6. Ascending Salary");
					System.out.println("7. Exit");
					System.out.println("Enter Choice");
					subChoice = ConsoleInput.getInt();
					switch(subChoice) {
					
				     case 4 :    // Ascending by name
					{
					for(int i = 0; i < indexEmployee - 1; i++) {
		                for(int j = 0; j < indexEmployee - i - 1; j++) {

		                    String a = arrEmployee[j].getName();
		                    String b = arrEmployee[j+1].getName();

		                    if(compareString(a, b) > 0) {
		                        Employee temp = arrEmployee[j];
		                        arrEmployee[j] = arrEmployee[j+1];
		                        arrEmployee[j+1] = temp;
		                    }
		                }
		            }
					}
					break;
					
				     case 5:
				     {  //descending by name
					for(int i = 0; i < indexEmployee - 1; i++) {
		                for(int j = 0; j < indexEmployee - i - 1; j++) {

		                    String a = arrEmployee[j].getName();
		                    String b = arrEmployee[j+1].getName();

		                    if(compareString(a, b) > 0) {
		                        Employee temp = arrEmployee[j];
		                        arrEmployee[j] = arrEmployee[j+1];
		                        arrEmployee[j+1] = temp;
		                    }
		                }
		            }
				     }
			    break;
				     case 6:
				     {  // comparing salary Ascending 
				    	 for(int i = 0; i < indexEmployee - 1; i++) {
				                for(int j = 0; j < indexEmployee - i - 1; j++) {

				                    if(arrEmployee[j].getBasicSalary()>arrEmployee[j+1].getBasicSalary()) {
				                        Employee temp = arrEmployee[j];
				                        arrEmployee[j] = arrEmployee[j+1];
				                        arrEmployee[j+1] = temp;
				                    }
				                }
				            }
				     }
				     break;
					}
				}while(subChoice!=7);
			}

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