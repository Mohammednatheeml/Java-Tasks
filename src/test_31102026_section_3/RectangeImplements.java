package test_31102026_section_3;

import java.util.Scanner;

public class RectangeImplements extends Shape{

	
	Scanner sc = new Scanner(System.in);
	@Override
	public void calculateArea() {
		System.out.println("Enter your length");
		int length = sc.nextInt();
		System.out.println("Enter your Width");
		int width = sc.nextInt();
		System.out.println(length*width);
		
		
	}

}
