package test_31102026_section_1;


//Question 3 => Overloading
public class Calculator {
	void add(int a , int b) {
		System.out.println("Addition:" +(a+b));
	}
	void add(int a , int b,int c) {
		System.out.println("Addition:" +(a+b+c));
	}
	void add(double a , double b) {
		System.out.println("Addition:" +(a+b));
	}
	
	
	public static void main(String [] args) {
		Calculator calculaterOverload = new Calculator();
		calculaterOverload.add(5, 5);
		calculaterOverload.add(6.00,5.00);
		calculaterOverload.add(5, 4,5);
		
	}
}
