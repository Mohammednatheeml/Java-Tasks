package test_31102026_section_1;

public class Student {

//	1. We have to use Encapsulation for this Situation. we have to use Private keyword for those name , age and marks and create a getter and setter function or else create a constructor.
//     Reason : if it contain some sensitive data then we have to use this encapsulation Concepts
//              only we have access those private variables inside the same class rather than different class
	
	private String name;
	private int age;
	private double marks;
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public void setmarks(double marks) {
		this.marks = marks;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public double getmark() {
		return marks;
	}
	
	public static void main(String [] args) {
		Student student = new Student();
		student.setname("natheem");
		student.setage(22);
		student.setmarks(567.67);
		
		System.out.println(student.getname());
		System.out.println(student.getage());
		System.out.println(student.getmark());	
	}
}
