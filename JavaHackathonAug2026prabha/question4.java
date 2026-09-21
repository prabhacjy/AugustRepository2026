package tekarchJavaHackathon;
//Q4. Given an array of integers check the Palindrome of the series.

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class question4 {
	
	private static void checkpalindrome(int[] array) {
		
		int len = array.length;
		
		int reversearray[] = new int[len];
		int count = 0;
		
		for (int j = len-1; j>=0; j--) {
			reversearray[count] = array[j];
			count++;
		}
		
		System.out.println();
		
		System.out.println("Reversed Array elements are :");
		for (int i=0;i<len;i++) {
			System.out.print(reversearray[i]+" ");
		}
		
		boolean isequal = false;
		
		isequal = Arrays.equals(array,reversearray);
		
		System.out.println();
		
		if (isequal) {
			System.out.println("Array of integers entered is a palindrome series.");
		} else {
			System.out.println("Array of integers entered is not a palindrome series.");
		}
			
	
		
	}
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.print("Enter the size of the array:");
			int arraysize = input.nextInt();
			
			int array[] = new int[arraysize];
			
			System.out.println("Enter the elements of the array :");
			for (int i=0; i<arraysize; i++) {
				System.out.print("Element ["+i+"] : ");
				array[i] = input.nextInt();
				
			}
			
			System.out.println("Array elements are :");
			for (int i=0;i<arraysize;i++) {
				System.out.print(array[i]+" ");
			}
			
			checkpalindrome(array);
			
			input.close();
			
		}catch (InputMismatchException e) {
			System.out.println("Invalid input. Please input Integer Value.");
		}
		
	}

	
}
