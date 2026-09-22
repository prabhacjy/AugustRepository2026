package day1JavaBasicExcercise;

import java.util.Scanner;

public class excercise3 {

	public static void main(String[] args) {
		// Printing the area and perimeter of the circle.
		
		Scanner radius = new Scanner(System.in); // User input of the radius 
		System.out.print("Enter the radius of the Circle : ");
		
		double rad = radius.nextDouble();
		
		// Area of the Circle
		double area =   Math.PI*rad*rad;
		
		System.out.println("Area of the Circle is " + area);
		
		// Perimeter of the Circle
		double peri = 2*Math.PI*rad;
		
		System.out.println("Perimeter of the Circle is " + peri);
		
		radius.close();
		

	}

}
