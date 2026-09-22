package day2JavaBasicsExercises;

import java.util.Scanner;

public class d2exer1 {

	public static void main(String[] args) {
		// Program to specify what day is today (demonstration for else if control structure)
		Scanner day = new Scanner(System.in);
        System.out.print("Enter the number (day) : ");
		int dow = day.nextInt();
		
		if(dow == 1) {
			System.out.println("The day is : Monday");
		} else if (dow == 2) {
			System.out.println("The day is : Tuesday");
			
		} else if (dow == 3) {
			System.out.println("The day is : Wednesday");
		} else if (dow == 4) {
			System.out.println("The day is : Thursday");
		} else if (dow == 5) {
			System.out.println("The day is : Friday");
		} else if (dow == 6) {
			System.out.println("The day is : Saturday");
		} else if (dow == 7) {
			System.out.println("The day is : Sunday");
		} else {
			System.out.println("The day is : Invalid");
		}
			
		
   		
		// Program to demonstrate Switch statement
		
		Scanner month = new Scanner(System.in);
        System.out.print("Enter the number (month) : ");
		int mon = month.nextInt();
		
		switch(mon) {
		
		case 1:
			System.out.println("The month is January");
		    break;
		    
		case 2:
			System.out.println("The month is Febuary");
			break;
			
         case 3:
		     System.out.println("The month is March");
		     break;
		     
		case 4:
			System.out.println("The month is April");
		    break; 
		    
		case 5:
			System.out.println("The month is May");
			break;
			
		case 6:
			System.out.println("The month is June");
			break;
			
		case 7:
			System.out.println("The month is July");
			break;
			
		case 8:
			System.out.println("The month is August");
			break;
			
		case 9:
			System.out.println("The month is September");
			break;
			
		case 10:
			System.out.println("The month is October");
			break;
			
		case 11:
			System.out.println("The month is November");
			break;
			
		case 12:
			System.out.println("The month is December");
			break;
			
	    default:
	    	System.out.println("The month is Invalid");
		
					
			
		}
		
		day.close();
		month.close();
		
		System.out.println("\nEnd of the Program");
		

	}

}
