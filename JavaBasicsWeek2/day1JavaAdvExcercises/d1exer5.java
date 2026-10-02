package day1JavaAdvExcercises;

import java.util.Scanner;
public class d1exer5 {


	public static int reverseInt(int digits) {
	// using the mathematical calculation
	/*	int remainder = 0;
		int reversedigit = 0;
		
		while (digits>0) {
			remainder = digits % 10 ; 
			reversedigit = reversedigit * 10 + remainder;
			
			digits = digits / 10;
			
		}
		return reversedigit; */
		// using the reusable methods 
		StringBuffer stringBuffer = new StringBuffer(String.valueOf(digits));
	    stringBuffer.reverse();
	    return Integer.parseInt(stringBuffer.toString());
	}
	
	public static String reverseString(String originalstr) {
	// StringBuilder.reverse("string to be reversed").toString() or
	//	StringBuffer("string to be reversed").reverse().toString() for multithread is used to reverse a string
		
		String reversed = new StringBuilder(originalstr).reverse().toString();
		return reversed;
		
	}

	public static void main(String[] args) {
		// Program to reverse a numeric or string
		
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want to reverse a 'string' or a 'digit' ?");
		String value = input.nextLine();
		
		if (value.equals("string")) {
			Scanner strinp = new Scanner(System.in);
			System.out.print("Enter the string to reverse :");
			String str = input.nextLine();
			System.out.println("The reversed string is :"+reverseString(str));
			
			
		} else if (value.equals("digit")) {
			Scanner intinp = new Scanner(System.in);
			System.out.println("Enter the digits to reverse :");
			int intg = intinp.nextInt();
				
			System.out.println("The reversed digits are :"+reverseInt(intg));
			
			
		} else {
			System.out.println("Invalid input");
		}
		
		input.close();
	

	}

}
