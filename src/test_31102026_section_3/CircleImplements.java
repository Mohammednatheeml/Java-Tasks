package test_31102026_section_3;

import java.util.Scanner;

public class CircleImplements extends Shape{

	Scanner sc = new Scanner(System.in);
	
//	Circle Area Formula = Pi * r * r
	
	@Override
	public void calculateArea() {
		
		double pi = 3.14;
		System.out.println("Enter your radius");
		int r = sc.nextInt();
		System.out.println(pi*r*r);
	}

	
	
	

	


}
