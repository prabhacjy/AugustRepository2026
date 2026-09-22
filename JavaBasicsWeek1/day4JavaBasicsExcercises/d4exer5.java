package day4JavaBasicsExcercises;

import java.util.Scanner;
import java.util.Arrays;

public class d4exer5 {
	
	public static void main(String[] args) {
		
        int a1[]= {90,20,40,30,70,50,60,10,80};
		
		int len=a1.length;
		
	// Printing the original array 
		
		System.out.print("The array is :");
		for (int i=0; i<len;i++) {
        System.out.print(" "+a1[i]);
		}
		System.out.println();

		// Getting the index from the user in which the element is to be removed. In array the index starts from 0 ...
		Scanner index=new Scanner(System.in);
		System.out.println("Enter the index in which the element has to be removed :");
		int indx = index.nextInt();
		
		// New array is 1 less than the length of original array since the element is removed
		int removedarr[] = new int[len-1];
		
		// Printing the array after removing the element
		for( int i=0, m= 0; i<a1.length; i++) {
			if (i == indx) continue;
			removedarr[m++] = a1[i];
			}
		
		int len2=removedarr.length;
				
		System.out.println("The array after removal of element at "+indx+" is :");
		for (int i=0; i<len2;i++) {
        System.out.print(" "+removedarr[i]);
		}
		System.out.println();
		
		index.close();
		
	}

}
