package oops;


//Interitance
public class Developer extends Employee {
	
	String ProgramminLanguage;

	public Developer(String name, int id, double salary , String ProgramminLanguage) {
		super(name, id, salary);
		this.ProgramminLanguage=ProgramminLanguage;
		// TODO Auto-generated constructor stub
	}

	
	 void displayInfo() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + id);
	        System.out.println("Salary: " + salary);
	        System.out.println("Programming Language: "
	                           + ProgramminLanguage);
	    }
	 
	 public static void main (String[]args) {
		 Developer developer = new Developer("NAtheem", 2, 30000.00, "Java-Full-Stack");
		 developer.displayInfo();
	 }
}
