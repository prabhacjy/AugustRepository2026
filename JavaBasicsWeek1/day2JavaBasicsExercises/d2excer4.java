package day2JavaBasicsExercises;

import java.util.Scanner;

public class d2excer4 {

	public static void main(String[] args) {
		// Program to print the multiplication of the number
		
		int mul = 0;
		
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number to show its multiplication table upto 10 times :");
		int num = number.nextInt();
		
		for (int i = 1; i<=10; i++) {
		
			mul = num * i;
			System.out.println(+num+" * "+i+" = "+mul);
					
		}
		  number.close();
	}
  
    
}
