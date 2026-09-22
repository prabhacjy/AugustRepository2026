package day2JavaBasicsExercises;

import java.util.Scanner;

public class d2exer2 {

	public static void main(String[] args) {
		// Find the largest of the three numbers using the if else ladder control statement
		
		Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
		int n1 = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
        System.out.print("Enter the 2nd number : ");
		int n2 = num2.nextInt();

		Scanner num3 = new Scanner(System.in);
        System.out.print("Enter the 3rd number : ");
		int n3 = num3.nextInt();

		if (n1>=n2 && n1>=n3) {
			System.out.println(+n1+" is the greatest number");
		} else if (n2>=n1 && n2>=n3) {
			System.out.println(+n2+" is the greatest number");
		} else {
			System.out.println(+n3+" is the greatest number");
		}
		
		
		// Find the largest of the three numbers using nested if statements
		
		if (n1>=n2) {
			if (n1>=n3) {
				System.out.println(+n1+" is the greatest number found using nested if");
			} else 
			{
				System.out.println(+n3+" is the greatest number found using nested if");
			}
		} else {
			if (n2>=n3) {
				System.out.println(+n2+" is the greatest number found using nested if");
			} else 
			{
				System.out.println(+n3+" is the greatest number found using nested if");
			}
		}
		
		num1.close();
		num2.close();
		num3.close();
		

	}

}
