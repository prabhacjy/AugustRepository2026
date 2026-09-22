package day3JavaBasicsExcercises;

import java.util.Scanner;

public class scannerexer {

	public static void main(String[] args) {
		// Program to use Scanner class and find its usage
		
		Scanner integr = new Scanner(System.in);
		System.out.print("Enter the interger value:");
		int intg = integr.nextInt();
		
		Scanner doubl = new Scanner(System.in);
		System.out.print("Enter the double value:");
	    double db = doubl.nextDouble();
	    
	    Scanner flt = new Scanner(System.in);
		System.out.print("Enter the float value:");
		float fl = flt.nextFloat();
		
		Scanner bool = new Scanner(System.in);
		System.out.print("Enter the boolean value:");
		boolean bl = bool.nextBoolean();
		
		System.out.println();
		System.out.println("******Printing the user input values******");
		System.out.println();
		
		
		System.out.println("The interger value is "+intg);
		System.out.println("The double value is "+db);
		System.out.println("The float value is "+fl);
		System.out.println("The boolean value is "+bl);
		
		
		System.out.println();
		System.out.println("******Arithmetic Operation of stored variable******");
		System.out.println();
		
		int a=10;
		int b=20;
		 
		System.out.println("Addition of " + a +" and "+ b +" is "+ (a + b));
		System.out.println("Multiplication of " + a +" and "+ b +" is "+ (a * b));
		System.out.println("Division of " + a +" by "+ b +" is "+ (a / b));
		System.out.println("Remainder of " + a +" by "+ b +" is "+ ( a % b));
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Name : ");
		String nam = scan.nextLine();
		
		System.out.print("Enter the Age : ");
	    int age = scan.nextInt();
	    
	    System.out.print("Enter the Gender : ");
		String gen  = scan.next();
		
		// scan.next() fetches the address before the null space 
		// scan.nextLine() skips the input for the "Enter the Address :" part
		// Hence again the scanner class is used to create a object scan1 to print the value for the Address
		Scanner scan1 = new Scanner(System.in);
		
		System.out.print("Enter the Address : ");
		String addr = scan1.nextLine();
		
		
		System.out.println();
		System.out.println("*****Personal Details*****");
		System.out.println();
		System.out.println("Name : "+nam);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gen);
		System.out.println("Address : "+addr);
		 
		System.out.println();
		
		Scanner scan3 = new Scanner(System.in);
		
		System.out.print("Enter the Number1 : ");
	    int num1 = scan3.nextInt();
	    System.out.print("Enter the Number2 : ");
	    int num2 = scan3.nextInt();
	    System.out.print("Enter the Number3 : ");
	    int num3 = scan3.nextInt();
	    
	    System.out.println();
	    System.out.println("The sum of three numbers are "+(num1+num2+num3));
	    System.out.println("The average of three numbers are "+((num1+num2+num3)/3));		
		
		integr.close();
		doubl.close();
		flt.close();
		bool.close();
		scan.close();
		scan1.close();
		scan3.close();
		
		

	}

}
