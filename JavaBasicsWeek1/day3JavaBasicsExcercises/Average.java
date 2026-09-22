package day3JavaBasicsExcercises;

import java.util.Scanner;

public class Average {
	
	double average;
	
	public double calprintAvg(int n1,int n2, int n3) {
		
		double average;
		average =(n1+n2+n3)/3;
		System.out.println("The average of "+n1+" , "+n2+" , "+n3+" are "+average);
        return average;	
		
	}
	
	

	public static void main(String[] args) {
			
		Scanner no1 = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
		int n1 = no1.nextInt();
		
		Scanner no2 = new Scanner(System.in);
        System.out.print("Enter the 2nd number : ");
		int n2 = no2.nextInt();

		Scanner no3 = new Scanner(System.in);
        System.out.print("Enter the 3rd number : ");
		int n3 = no3.nextInt();
		
		Average avg=new Average();
		avg.calprintAvg(n1,n2,n3);
		
		no1.close();
		no2.close();
		no3.close();
		

	}

}
