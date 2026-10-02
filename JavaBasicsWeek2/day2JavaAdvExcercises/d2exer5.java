package day2JavaAdvExcercises;

import java.util.Scanner;

public class d2exer5 {

	public static void main(String[] args) {
		// Program to search an element in the array of integers using sequential search
		
        int arr[] = {13,14,12,11,10,19,18,16,17};
		
		System.out.println("The array :");
		for (int icrementor : arr) {
			System.out.print(icrementor + " ");
			
		}
		
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the element to be located in the array :");
		int val = input.nextInt();
		
		int len = arr.length;
		int temp;
		int located = 0;
		
		for (int i = 0; i < len; i++) {
			temp = arr[i];
			if (val == temp) {
				System.out.println("The element "+val+" is located at the index "+i+" in the array");
				located = 1;
			}
			
		}
		 if (located != 1) {
			 System.out.println("The element "+val+" is not available in the array");
		 }
		 
		 input.close();
		 
	}

}
