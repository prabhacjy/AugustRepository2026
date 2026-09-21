package tekarchJavaHackathon;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Q3.	Given an array of integers, sort the integer values.
public class question3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		try
		{
		System.out.print("Enter the size of the array :");
		int arraysize = input.nextInt();
		
		System.out.println();
		System.out.println();
		System.out.println("Enter the elements of the array:");
		
		int arr[] = new int[arraysize];
		
		for ( int i = 0; i < arraysize; i++) {
			
			System.out.print("Element of ["+i+"] =");
			arr[i] = input.nextInt();
						
		}
		
		System.out.println();
		//Displaying array elements before sorting 
		System.out.println("The Elements of the array before sorting :");
		
		for (int i =0; i<arraysize; i++) {
			System.out.print(arr[i]+" ");
		}
		
		Arrays.sort(arr);
		
		//Displaying array elements before sorting 
		System.out.println();
		System.out.println();
		System.out.println("The Elements of the array after sorting :");
		for (int i =0; i<arraysize; i++) {
			System.out.print(arr[i]+" ");
			}
		
		input.close();
		
		
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter integer value.");
			
		}
		

	}

}
