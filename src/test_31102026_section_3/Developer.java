package test_31102026_section_3;

public class Developer extends Employee{

	String emprole;
	Developer(int employeeId, String empname,String emprole) {
		super(employeeId, empname);
		this.emprole= emprole;
	}
	
	public void displayDetails() {
		System.out.println("Employee Name:"+empname);
		System.out.println("Employee ID:"+employeeId);
		System.out.println("Employee Role:"+emprole);
	}

}
