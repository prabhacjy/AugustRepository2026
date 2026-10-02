package day2JavaAdvExcercises;

import java.util.Scanner;

public class d2exer2 {
	
	
	// function or method overloading with the same name findlargest but with two parameters for comparison
	public static int findlargest(int num1, int num2) {
		
		if(num1>=num2) {
			return num1;
		} else {
			return num2;
		}
		
	}

	// findlargest - function overloading with three arguments for comparison
	// its a single integer value return type 
	public static int findlargest(int num1,int num2, int num3) {
		
		if (num1>=num2 && num1>=num3) {
			return num1;
		} else if (num2>=num1 && num2>=num3) {
			return num2;
		} else {
			return num3;
		}
		
	}
	
	// function overloading with single parameter to calculate the area of the circle
	public static double area(int radius) {
		double area;
		area = Math.PI*radius*radius;
		return area;
	}
	
	// function overloading with single parameter to calculate the area of the triangle
	public static double area(int side1, int side2, int side3) {
		 double perimeter = side1 + side2 + side3;
		 double semip = perimeter/2;
		 double area = Math.sqrt(semip*(semip-side1)*(semip-side2)*(semip-side3));
		 return area;
	}
	
	
	public static void main(String[] args) {
		// Program to use function overloading
		
		System.out.println("*****The largest of three numbers*****");
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number1 :");
		int num1 = input.nextInt();
		System.out.print("Enter the number2 :");
		int num2 = input.nextInt();
		System.out.print("Enter the number3 :");
		int num3 = input.nextInt();		
			
		System.out.println("The largest of three number is "+findlargest(num1,num2,num3));
	
		System.out.println();
		System.out.println("*****The largest of two numbers*****");
		System.out.println();
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("Enter the number1 :");
		int no1 = input1.nextInt();
		System.out.print("Enter the number2 :");
        int no2 = input1.nextInt();

		
		System.out.println("The largest of two number is "+findlargest(no1,no2));
	
		System.out.println();
		System.out.println("*****Triangle*****");
		System.out.println();
		
		Scanner input3 = new Scanner(System.in);
		
		System.out.print("Enter the side1 of the Triangle :");
		int side1 = input3.nextInt();
		System.out.print("Enter the side2 of the Triangle :");
		int side2 = input3.nextInt();
		System.out.print("Enter the side3 of the Triangle :");
		int side3 = input3.nextInt();
		
		System.out.println("Area of the Triangle is "+area(side1,side2,side3));
	
		System.out.println();
		System.out.println("*****Circle*****");
		System.out.println();
		
		Scanner input4 = new Scanner(System.in);
		
		System.out.print("Enter the radius of the Circle :");
	    int radius = input4.nextInt();
		
		System.out.println("Area of the Circle is "+area(radius));
		
		input.close();
		input1.close();
		input3.close();
		input4.close();

	}

}
