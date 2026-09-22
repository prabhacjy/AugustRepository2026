package day4JavaBasicsExcercises;

import java.util.Arrays;

public class d4exer7 {

	public static void main(String[] args) {
		// Program to find the maximum and minimum element in a 1D array
		
          int a1[]= {90,20,40,30,70,50,60,10,80};
		
		int len=a1.length;
				
		System.out.print("The array is :");
		for (int i=0; i<len;i++) {
        System.out.print(" "+a1[i]);
		}
		System.out.println();
		Arrays.sort(a1);
        System.out.println("Array after sorting:");
		
		for(int i=0; i<len; i++) {
	    System.out.print(" "+a1[i]);
		}
		System.out.println();
		
		
		System.out.println("The minimum element in the array is "+a1[0]);
		System.out.println("The maximum element in the array is "+a1[len-1]);
		
	}

}
