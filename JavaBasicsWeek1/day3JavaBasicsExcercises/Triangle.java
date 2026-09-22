package day3JavaBasicsExcercises;

import java.util.Scanner;

public class Triangle {
	// Program to print area and perimeter of triangle by creating a class triangle with no argument in the constructor
	
    // Initializing the sides of the triangle
	int s1;
	int s2;
	int s3;
	
	Triangle()
	{
		int s1=3;
		int s2=4;
		int s3=5;
		double area;
		double perimeter;
		double semip;
		
	   perimeter = s1 + s2 + s3;
	   semip = perimeter/2;
	   area = Math.sqrt(semip*(semip-s1)*(semip-s2)*(semip-s3));
	   
	   System.out.println("Area of the Triangle is "+area);
	   System.out.println("Perimeter of the Triangle is "+perimeter);
	
	}


	public static void main(String[] args) {
		

		Triangle triangle = new Triangle();
		
		
	}

}
