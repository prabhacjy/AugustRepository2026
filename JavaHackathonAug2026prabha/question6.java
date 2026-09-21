package tekarchJavaHackathon;

import java.util.InputMismatchException;
import java.util.Scanner;

//Q6.	WJP to perform ascending order Selection  sort
public class question6 {
	
	public static void selectionsort(int[] array) {
		
		int len = array.length;
		for (int i = 0; i < len-1 ; i++) {
			for (int j = 0; j < len-1-i; j++) {
				if (array[j] > array[j+1]) {
					// swapping the values using temporary variable
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("The Elements of the array after Selection sort :");
		for (int i=0;i<len;i++) {
			System.out.print(array[i]+" ");
					}
		
	}

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.print("Enter the size of an array :");
			int arrsize = input.nextInt();
			int array[] = new int[arrsize];
			System.out.println("Enter the elements of the array :");
			for (int i=0;i<arrsize;i++) {
				System.out.print("Element ["+i+"] :");
				array[i] = input.nextInt();
			}
			
			System.out.println("The Elements of the array before Selection sort :");
			for (int i=0;i<arrsize;i++) {
				System.out.print(array[i]+" ");
						}
			selectionsort(array);
			
		}catch(InputMismatchException e) {
			System.out.println("Invalid input. Please enter an integer value.");
		}
		
		input.close();

	}

}
