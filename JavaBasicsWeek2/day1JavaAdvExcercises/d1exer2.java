package day1JavaAdvExcercises;

import java.util.Scanner;

public class d1exer2 {
	static void factorial(int num) {
		int factorial = 1;
		
		System.out.println();
		
		for (int i = 1; i<=num ; i++) {
			factorial = factorial * i;
		}
	  
		System.out.println(" The factorial of "+num+" is "+factorial);
	}
	
	public static void main(String[] args) {
		// Program to find the factorial of the number
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to find its factorial :");
		int num = input.nextInt();
		
		factorial(num);
		
		input.close();
		

	}

}
