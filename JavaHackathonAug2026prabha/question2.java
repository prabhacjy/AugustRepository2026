package tekarchJavaHackathon;

import java.util.InputMismatchException;
import java.util.Scanner;

//Q2. write a program to find factorial (Non Recursive)
public class question2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		try
		{
		System.out.print("Enter the number to find its factorial :");
		int factnum = input.nextInt();
		
		long factorial = 1;
		for (int i=1; i<=factnum; i++) {
			factorial = factorial * i;
		}
		
		System.out.print("Factorial of "+factnum+" is "+factorial);
		input.close();
		
		} catch(InputMismatchException e) {
			System.out.println("Invalid Input. Please enter an integer value.");
		}

	}

}
