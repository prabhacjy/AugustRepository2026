package tekarchJavaHackathon;

import java.util.Scanner;

//Q29. WJP to perform Merge sort using recursion 

//merge sort algorithm works by dividing the array into two half using mid index
//dividing the right and left side of the array
//dividing all right and left element become a single element
// merge the two array using three iterator and by comparing and swapping elements
public class question29 {

	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftsize = leftHalf.length;
		int rightsize = rightHalf.length;
		
		int i=0, j=0, k=0;
		
		while(i<leftsize && j<rightsize) {
			if(leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			} else {
				inputArray[k]= rightHalf[j];
				j++;
			}
			k++;
			
			while (i<leftsize) {
				inputArray[k] = leftHalf[i];
				i++;
				k++;
			}
			while (j<rightsize) {
				inputArray[k] = rightHalf[j];
				j++;
				k++;
				
			}
		}
	}
	
	private static void mergesort(int[] inputArray) {
		int inputlength = inputArray.length;
		if (inputlength<2) {
			return;
		}
		int midIndex = inputlength /2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputlength - midIndex];
		
		for (int i=0; i<midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		
		for (int i=midIndex; i<inputlength; i++) {
			rightHalf[i-midIndex] = inputArray[i];
		}
		
		mergesort(leftHalf);
		mergesort(rightHalf);
		
		merge(inputArray,leftHalf,rightHalf);
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int arraysize = input.nextInt();
		
		int numbers[] = new int[arraysize];
		for (int i=0; i<arraysize; i++)
		{
			System.out.print("Element ["+i+"] : ");
			numbers[i] = input.nextInt();
			
		}
		
		System.out.println("Array before sorting : ");
		for (int i=0; i<arraysize; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		mergesort(numbers);
		System.out.println();
		System.out.println("Array after merge sorting : ");
		for (int i=0; i<arraysize; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		input.close();

	}

}
