package day1JavaBasicExcercise;

import java.util.Scanner;

public class excercise4 {

	public static void main(String[] args) {
		// Print the area and perimeter of the Rectangle
		
		Scanner width = new Scanner(System.in);
		System.out.print("Enter the width of the Rectangle : ");
		
		double wid = width.nextDouble();
		
		Scanner height = new Scanner(System.in);
		System.out.print("Enter the height of the Rectangle : ");
		
		double hgt = height.nextDouble();
		
		// Area of the Rectangle
		double area = wid*hgt;
		
		System.out.println("Area of the Rectangle is " + area);
		
		// Perimeter of the Rectangle 
		double peri = 2*(wid+hgt);
		
		System.out.println("Perimeter of the Rectangle is " + peri);
		
		width.close();
		height.close();
	
	}

}
