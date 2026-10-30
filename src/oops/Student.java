package oops;


//Class and Object
public class Student {
	public void StudentDetails(String name , int rollno , double mark) {
		System.out.println("Student Name:"+ name);
		System.out.println("Student RollNo:"+ rollno);
		System.out.println("Student Mark:"+ mark);
	}
	
	public static void main(String []args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.StudentDetails("Natheem", 34, 95.0);
		student2.StudentDetails("Ashik", 32, 98.0);
	}
}



