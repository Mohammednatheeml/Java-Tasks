package test_31102026_section_1;


//Question 2 => Inheritance concepts
public class Vehicle {
	String modelName;
	double price;
	
	Vehicle(String modelName , double price){
		this.modelName=modelName;
		this.price = price;
	}
	
	void displayCarInfo() {
		System.out.println("Model Name:"+this.modelName);
		System.out.println("Price:"+this.price);
	}
}
