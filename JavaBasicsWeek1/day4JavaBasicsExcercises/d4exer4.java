package day4JavaBasicsExcercises;

import java.util.Scanner;

public class d4exer4 {

	public static void main(String[] args) {
		// Program to find the index of an array element
		
     int a1[]= {10,20,30,40,50,60,70,80,90};
		
		int len=a1.length;
				
		System.out.print("The array is :");
		for (int i=0; i<len;i++) {
        System.out.print(" "+a1[i]);
		}
		System.out.println();
		
		Scanner findindex = new Scanner(System.in);
		System.out.print("Enter the array element whose index is to be located :");
		int indx = findindex.nextInt();
		
		int tempval;
		int indicator = 0;
		for (int i=0; i<len;i++) {
	        tempval = a1[i];
	        if (tempval == indx) {
	        	System.out.println("The index of "+indx+" in the array is "+i);
	        	
	        	indicator = 1;
	        }
			}
		if (indicator != 1) {
			System.out.println("The value "+indx+" is not in the array to locate its index");
		}
		findindex.close();
		

	}

}
