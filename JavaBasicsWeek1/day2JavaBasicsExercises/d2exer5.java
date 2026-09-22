package day2JavaBasicsExercises;

import java.util.Scanner;

public class d2exer5 {

	public static void main(String[] args) {
		// Program to find the first big, second big and third biggest number  taking user input using scanner function
		Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
		int n1 = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
        System.out.print("Enter the 2nd number : ");
		int n2 = num2.nextInt();

		Scanner num3 = new Scanner(System.in);
        System.out.print("Enter the 3rd number : ");
		int n3 = num3.nextInt();
		int val = 0;

		if (n1>=n2 && n1>=n3) {
			System.out.println(+n1+" is the first big number");
			val = n1;
		} else if (n2>=n1 && n2>=n3) {
			System.out.println(+n2+" is the first big number");
			val = n2;
		} else {
			System.out.println(+n3+" is the first big number");
			val = n3;
					}
		
		
		if (val==n1) {
			if (n2>=n3) {
				System.out.println(+n2+" is the second big number");
				System.out.println(+n3+" is the third biggest number");
			} else if (n3>=n2) {
				System.out.println(+n3+" is the second big number");
				System.out.println(+n2+" is the third biggest number");
			}
		} else if (val==n2) {
			if (n1>=n3) {
				System.out.println(+n1+" is the second big number");
				System.out.println(+n3+" is the third biggest number");
			} else if (n3>=n1) {
				System.out.println(+n3+" is the second big number");
				System.out.println(+n1+" is the third biggest number");
			}
		} else {
			if (n1>=n2) {
				System.out.println(+n1+" is the second big number");
				System.out.println(+n2+" is the third biggest number");
			} else if (n2>=n1) {
				System.out.println(+n2+" is the second big number");
				System.out.println(+n1+" is the third biggest number");
			}
		}
		
		num1.close();
		num2.close();
		num3.close();
		
	}
	}


