package day1JavaAdvExcercises;

import java.util.Scanner;
public class d1exer4 {

	 static boolean checkPrime(int n) {
		 boolean val = false;
		 
		if (n<=1) {
			val = false;
		} 
		for(int i=2 ; i < n ; i++ ) {
			
			if (n % i == 0) {
				val = false;
				break;
			} 
			
			val = true;
	
		}
	  return val;
	  
	}
	public static void main(String[] args) {
		// Program to check whether the given number is prime number or not
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to find whether it is prime or not :");
		int num = input.nextInt();
		
		boolean val = checkPrime(num);
		if (val == true) {
			System.out.println("The "+num+" is a prime number");
		} else {
			System.out.println("The "+num+" is not a prime number");
		}
			
		input.close();

	}

}
