package employee_management_system_package;
import java.util.Scanner;
import java.util.HashSet;


public class EmployeeService {
	
	Scanner sc = new Scanner(System.in);
	
	HashSet <Employee> hSet = new HashSet <Employee>();
	
	
//	For setting default value : But it's not working! Need to work here. 
	
//	Employee emp1 = new Employee(101, "Sazzad", 23, "Doctor", "Medicine", 20000);
//	Employee emp2 = new Employee(102, "Azzad", 23, "Engineer", "Software Engineering", 30000);
//	Employee emp3 = new Employee(103, "Bazzad", 24, "Lawyer", "Law&Justice", 40000);
//	Employee emp4 = new Employee(104, "Cazzad", 25, "Pharmacist", "Manufacturing", 50000);
//	
//	hSet.add(emp1);
//	hSet.add(emp2);
//	hSet.add(emp3);
//	hSet.add(emp4);
	
	
	//Delete Employee
	public void deleteEmployee() {
		boolean found = true;
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		for(Employee e : hSet) {
			if(e.getId() == id) {
				hSet.remove(e);
				System.out.println("Employee deleted successfully.");
				found = true;
			}
		}
		if(!found) {
			System.out.println("Id not found.");
		}
	}
	
	
	//Update employee
	public void updateEmployee() {
		boolean found = false;
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		for(Employee e : hSet) {
			if(e.getId() == id) {
				System.out.println("Enter Name: ");
				String name = sc.next();
				e.setName(name);
				
				System.out.println("Enter Age: ");
				int age = sc.nextInt();
				e.setAge(age);
				
				System.out.println("Enter Designation: ");
				String position = sc.next();
				e.setDesignation(position);
				
				System.out.println("Enter Department: ");
				String dept = sc.next();
				e.setDepartment(dept);
				
				System.out.println("Enter Salary: ");
				double salary = sc.nextDouble();
				e.setSalary(salary);
				
				System.out.println(e);
				System.out.println("Employee updated successfully.");
				
				found = true;
			}
		}
		if(!found) {
			System.out.println("Id not found!");
		}
	}
	
	//View employee
	public void viewEmployee() {
		boolean found = false;
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		for(Employee em: hSet) {
			if(em.getId() == id) {
				System.out.println(em);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee not found! ");
		}
		
	}
	
	//View all employee
	public void viewAllEmployee() {
		boolean found = false;
		for(Employee e: hSet) {
			System.out.println(e);
			found = true;
		}
		if(!found) {
			System.out.println("Employee not found!! Please add employee. ");
		}
	}
	
	//ADD Employee
	public void addEmployee() {
		
		
		
		System.out.println("Enter your id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your position: ");
		String designation = sc.next();
		
		System.out.println("Enter your department: ");
		String department = sc.next();
		
		System.out.println("Enter your salary: ");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(id, name, age, designation, department, salary);
		hSet.add(emp);
		System.out.println(emp);
		System.out.println("Employee added successfully.");
		
		
	}

}
