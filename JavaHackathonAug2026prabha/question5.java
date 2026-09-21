package tekarchJavaHackathon;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Q5.	Given an array prints the unique numbers and
//    also print the number of occurrences of duplicate numbers.

public class question5 {
	
	public static void printuniqueElements(int[] array) {
		
		//  To find unique elements in the array 
        // converting the array into a stream using Arrays.stream()
        // Applying the distinct() method to filter out duplicates
        // Applying the Arrays.toArray() method to convert it back to array
		
		int uniquearray [] = Arrays.stream(array).distinct().toArray();
		int uniqlen = uniquearray.length; 
        System.out.println();
        System.out.println("The unique array after removing the duplicates are the following :");            
        for (int k=0;k <uniqlen; k++) {
        	System.out.print(uniquearray[k]+" ");
        }

	}
	
	public static void findduplicateElements(int[] array) {
		
		System.out.println();
		System.out.println("The Duplicate elements in the array are the following :");
	
		int uniquearray [] = Arrays.stream(array).distinct().toArray();
		int uqlen = uniquearray.length;
	
		int len = array.length;
		
        // Passing the unique array as the outer loop to avoid duplicate and to find its count
		 
		int count = 0;
		for (int i=0; i<uqlen;i++)
		{
			
			count = 0;
			for (int j=0; j<len; j++) {
					if (uniquearray[i]==array[j]) {
					count++;
				}
			}
		    // if the count is 1 the number appears only once
			// if the count is greater than 1 the element is duplicated 
			if (count > 1) {
				System.out.println(uniquearray[i]+" -> "+count);
									}
			
		}
		// if there is no duplicates the count will be 1 when loop exist for its first occurance 
		if (count == 1) {
			System.out.println("No duplicates in the array.");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.print("Enter the size of the array : ");
			int arrsize = input.nextInt();
			
			int array[] = new int[arrsize];
			System.out.println("Enter the elements of the array :");
			for (int i=0; i<arrsize; i++) {
				System.out.print("Element ["+i+"] :");
				array[i]=input.nextInt();
			}
			
			
			System.out.println("Array elements are :");
			for (int i=0;i<arrsize;i++) {
				System.out.print(array[i]+" ");
			}
			
			printuniqueElements(array);
		  
			findduplicateElements(array);
			
			
			input.close();
			
		} catch(InputMismatchException e) {
			System.out.println("Invalid input. Please enter the integer value.");
		}
		

	}

}
