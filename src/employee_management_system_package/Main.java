package employee_management_system_package;
import java.util.Scanner;

public class Main {
	public static void menu() {
		System.out.println("----------Welcome to the Menu-----------"
				+ "\n1. Add Employee"
				+ "\n2. View Employee"
				+ "\n3. Update Employee"
				+ "\n4. Delete Employee"
				+ "\n5. View all employee"
				+ "\n6. Exit from the application");
	}
	public static void main(String [] args) {
		
		EmployeeService service = new EmployeeService();
		
		do {
			menu();
			System.out.println("Enter Your Choice: ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: 
				System.out.println("Add Employee");
				service.addEmployee();				
				break;
			case 2: 
				System.out.println("View Employee");
				service.viewEmployee();
				break;
			case 3: 
				System.out.println("Update Employee");
				service.updateEmployee();
				break;
			case 4: 
				System.out.println("Delete Employee");
				service.deleteEmployee();
				break;
			case 5: 
				System.out.println("View all employee");
				service.viewAllEmployee();
				break;
			case 6: 
				System.out.println("Thank you for using the application");
				System.exit(0);
				break;
			default: 
				System.out.println("Enter a valid number");
				break;
				
			}
			
		}while(true);
		
		
	}

}
