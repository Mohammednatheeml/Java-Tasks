package lambdaFunction;

public class Main {
	 public static void main(String[] args) {

	        String name = "Natheem";
	        int age = 22;
	        String department = "Java";

	        Student s = () -> {
	            System.out.println("Student Name: " + name);
	            System.out.println("Age: " + age);
	            System.out.println("Department: " + department);
	        };

	        s.display();
	        
	        // Addition
	        Calculator add = (a, b) -> a + b;
	        // Subtraction
	        Calculator sub = (a, b) -> a - b;
	        // Multiplication
	        Calculator mul = (a, b) -> a * b;
	        // Division
	        Calculator div = (a, b) -> a / b;
	        System.out.println("Addition: " + add.calculate(20, 10));
	        System.out.println("Subtraction: " + sub.calculate(20, 10));
	        System.out.println("Multiplication: " + mul.calculate(20, 10));
	        System.out.println("Division: " + div.calculate(20, 10));
	    }

}
