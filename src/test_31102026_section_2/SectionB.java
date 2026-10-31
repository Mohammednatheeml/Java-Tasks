package test_31102026_section_2;



public class SectionB {
	
//	Question 6
	//  Method Overloading  => Compile time polymorphism, it occurs within the same class , we have to write the same methods with different parameter
	/*	For Example => void calculate(int a , int b) {
			System.out.println("Addition:" +(a+b));
		}
		void calculate(double a , double b) {
			System.out.println("subraction:" +(a-b));
		}
		void calculate(int a , double b) {
			System.out.println("multiplication:" +(a*b));
		}
		void calculate(double a , int b) {
			System.out.println("division:" +(a/b));
		}
	*/	
	// Method Overriding => Run time polymorphism , it occurs in different class using extends keyword, here the child class override the parent class method with same parameter using super keyword
	/* For Example  => 
	 Public class Parent 
	 void display() {
		System.out.println("This is parent class");
	}
		
	public class ChildClass extends ParentClass{
	
	@Override
	void display() {
		System.out.println("This is child class");
		System.out.println("this is Over-riding method");
	}
	
	public static void main(String[]args) {
		ChildClass childClass = new ChildClass();
		ParentClass parentClass = new ParentClass();
		parentClass.display();
		childClass.display();
	}
}
	*/
	
	
//Question 7
	
//	Abstract => partially abstract , it have normal methods , abstract methods , variables , Constructor allowed and it extends only one class
// Interface => Fully abstract , it have abstract methods , here (public,static,final) is default , here we can write default static and private method in the same intercafe .
	
	
//Question 8
	
// Encapsulation => It is wrapping the data and variables into single variables, archived using Pivate , setter and getter
//Inheritance => It is the prrocess where one class can access the prperties and methods of another class
// Abstraction => It hides the important implementations and show only the essentials to the users
//Polymorphism => Polymorphism means i hava one name but many forms ...two types of polymorphism => Overloading , overriding
	
	
//Question 9
//Noo we cant access the parent class private properties via its child class because, if we use private then we can access it via only the same class 
// if we want to use private properties the we have to create setter and getter function
}
