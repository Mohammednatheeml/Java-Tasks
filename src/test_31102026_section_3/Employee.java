package test_31102026_section_3;

public class Employee {
	int employeeId;
	String empname;
	
	Employee(int employeeId,String empname){
		this.employeeId = employeeId;
		this.empname = empname;
	}
	
	public void displayDetails() {
		System.out.println("Employee Name:"+empname);
		System.out.println("Employee ID:"+employeeId);
	}
}
