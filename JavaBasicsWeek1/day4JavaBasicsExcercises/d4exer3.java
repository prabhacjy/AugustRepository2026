package day4JavaBasicsExcercises;

import java.util.Scanner;
import java.io.Console;


public class d4exer3 {

	public static void main(String[] args) {
		
		// Program to calculate the 
		int a1[]= {10,20,30,40,50,60,70,80,90};
		
		int len=a1.length;
				
		System.out.print("The array is :");
		for (int i=0; i<len;i++) {
        System.out.print(" "+a1[i]);
		}
		System.out.println();
		
		Scanner scanval = new Scanner(System.in);
		System.out.print("Enter the value to be located in array :");
		int foundval = scanval.nextInt();
		
		int tempval;
		int indicator = 0;
		for (int i=0; i<len;i++) {	
	        tempval = a1[i];
	        if (tempval == foundval) {
	        	System.out.println("The value "+foundval+" is found in the array");
	        	indicator = 1;
	        }
			}
		if (indicator != 1) {
			System.out.println("The value "+foundval+" is not found in the array");
		}
		scanval.close();
		
	}

}
