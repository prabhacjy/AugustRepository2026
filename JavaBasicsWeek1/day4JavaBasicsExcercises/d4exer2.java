package day4JavaBasicsExcercises;

import java.util.Arrays;
import java.util.Scanner;

public class d4exer2 {

	public static void main(String[] args) {
		// Program to sort a numeric array and a string array
		
		int num[]= {10,99,88,33,22,7,66,11,21,45};
		String str[] = {"Car","Bus","Plane","Train","Truck","Roadroller","Cement Mixer","Helicopter","Zepolean","Rocket"};
		
		int nl=num.length;
		System.out.println("Numeric array before sorting:");
		
		for(int i=0; i<nl; i++) {
	    System.out.print(" "+num[i]);
		}
		System.out.println();
		
		Arrays.sort(num);
        System.out.println("Numeric array after sorting:");
		
		for(int i=0; i<nl; i++) {
	    System.out.print(" "+num[i]);
		}
		System.out.println();
		
		int sl=str.length;
		System.out.println("String array before sorting:");
		
		for(int i=0; i<nl; i++) {
	    System.out.print(" "+str[i]);
		}
		System.out.println();
		
		Arrays.sort(str);
        System.out.println("String array after sorting:");
		
		for(int i=0; i<sl; i++) {
	    System.out.print(" "+str[i]);
		}
		System.out.println();
	}

}