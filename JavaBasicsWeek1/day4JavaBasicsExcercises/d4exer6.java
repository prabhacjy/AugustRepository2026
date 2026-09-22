package day4JavaBasicsExcercises;

import java.util.Scanner;

public class d4exer6 {

	public static void main(String[] args) {
		// Program to insert a specific element into an array
        int a1[]= {90,20,40,30,70,50,60,10,80};
		
		int len=a1.length;
		
	    // Printing the original array 
		
		System.out.print("The array is :");
		for (int i=0; i<len;i++) {
        System.out.print(" "+a1[i]);
		}
		System.out.println();

		// Getting the index from the user in which the element is to be updated. In array the index starts from 0 ...
		Scanner index=new Scanner(System.in);
		System.out.println("Enter the index in which the element has to be inserted :");
		int indx = index.nextInt();
		
		Scanner nwelement = new Scanner(System.in);
		System.out.println("Enter the element which is to be inserted in the index position "+indx+" :");
		int element = index.nextInt();
		
		
		// New array is 1 greater than the length of original array since the element is removed
		int appendedarr[] = new int[len+1];
		
		// creating a new array with the new element being appended 
		for( int i=0, m= 0; i<a1.length; i++) {
			if (i == indx) appendedarr[m++]= element;
			appendedarr[m++] = a1[i];
			}
		
		int len2 = appendedarr.length;
				
		// Displaying the new array after inserting the element
		System.out.println("The array after inserting the element "+element+" at  the index"+indx+" is :");
		for (int i=0; i<len2;i++) {
        System.out.print(" "+appendedarr[i]);
		}
		System.out.println();
		
		index.close();
		nwelement.close();
			

	}

}
