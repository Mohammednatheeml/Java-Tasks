package test_31102026_section_1;



public class Car extends Vehicle{
	
	
	Car(String modelName , double price){
		super(modelName,price);
	}
	
	public static void main (String [] args) {
		Car car1 = new Car("Maruthi",4567.89d);
		Car car2 = new Car("BMW",5678907.89d);
		car1.displayCarInfo();
		car2.displayCarInfo();
		
	}
	
}
