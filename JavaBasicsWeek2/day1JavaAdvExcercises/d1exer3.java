package day1JavaAdvExcercises;

import java.util.Scanner;

public class d1exer3 {
	
	static void findlargest(int n1, int n2, int n3) {
		
		if (n1>=n2 && n1>=n3) {
			System.out.println(+n1+" is the largest number");
		} else if (n2>=n1 && n2>=n3) {
			System.out.println(+n2+" is the largest number");
		} else {
			System.out.println(+n3+" is the largest number");
		}
		
	}
	
	static void findlargest(int nn1,int nn2) {
		
		if (nn1>=nn2) {
			System.out.println(+nn1+" is the largest number");
		} else {
			System.out.println(+nn2+" is the largest number");
		} 
		
	}

	public static void main(String[] args) {
		// Program to find the largest of three numbers and two number 
		
		System.out.println("******Largest of three numbers*******");
		Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
		int n1 = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
        System.out.print("Enter the 2nd number : ");
		int n2 = num2.nextInt();

		Scanner num3 = new Scanner(System.in);
        System.out.print("Enter the 3rd number : ");
		int n3 = num3.nextInt();

		findlargest(n1, n2, n3);
					
		System.out.println("******Largest of two numbers*******");
		Scanner nnum1 = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
		int nn1 = nnum1.nextInt();
		
		Scanner nnum2 = new Scanner(System.in);
        System.out.print("Enter the 2nd number : ");
		int nn2 = nnum2.nextInt();
		
		findlargest(nn1, nn2);
		
		
		num1.close();
		num2.close();
		num3.close();
		nnum1.close();
		nnum2.close();
		

	}

}
