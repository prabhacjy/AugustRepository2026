package tekarchJavaHackathon;

import java.util.Arrays;
import java.util.Scanner;

//Q25. Write a program for binary search. And 5 i/p has to take from user 
//as binary elements.
public class question25 {
    // Binary search always performed on the sorted array
	// first finds the lowest and highest index of the array 
	// finds the mid of the array (low+(high-low)/2
	// if the element to be found is equal to mid returns mid
	// else find if the value is less or greater than mid 
	// if less takes mid as high else makes mid as low
	// divides the array and searches until mid meets low and returns the index
	public static int binarySearch(int biarr[],int low, int high, int valtf) {
		if (high >= low){
			int mid = (low + (high-low))/2;
			
			if (biarr[mid] == valtf)
				return mid;
		
			if(biarr[mid] > valtf) {
				return binarySearch(biarr,low,mid-1,valtf);
			} else {
				return binarySearch(biarr,mid+1,high,valtf);
			}
		}
		return -1; // when the element is not found in the array
		
	}
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the five array elements for binary search (only 0 or 1 -binary value) :");
		int biarr [] = new int[5];
		for (int i=0 ; i<5; i++) {
			System.out.print("Element ["+i+"] : ");
			biarr[i] = input.nextInt();	
		}
		
		Arrays.sort(biarr); // In binary search the array always needs to be sorted first
		
		System.out.print("Enter the element to be found : ");
		int valtofound = input.nextInt();
		
	
		int index = binarySearch(biarr,0,5,valtofound);
		
		if (index == -1) {
			System.out.println("Element is not present in the array");
		} else {
			System.out.println("Element is present in the index ("+index+") of the array");
		}
		input.close();
		
	}

}
