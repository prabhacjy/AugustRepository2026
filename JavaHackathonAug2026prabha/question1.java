package tekarchJavaHackathon;

import java.util.InputMismatchException;
import java.util.Scanner;

// Q1.	Consider there is a 3 Boolean variable called a, b, c. 
// Check if at least two out of three Booleans are true.

public class question1 {
	
	public static void checktwoBoolean(boolean a,boolean b, boolean c) {
		int count = 0;
		if ((a&&b) || (b&&c) || (c&&a)) {
			count++;
		}
		if (count >0) {
			if(a && b && c) {
				System.out.println("All the entered values of the variables a, b, and c are true");
			}else {
				System.out.println("Two out of three entered values of the variales a, b, and c are true");
			}
		} else {
			System.out.println("No two out of three entered values of the variales a, b, and c are true");
		} 
	}
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		try
		{
			
		
		System.out.print("Enter the value a (true or false) :");
		boolean inputa = input.nextBoolean();
		
		System.out.print("Enter the value b (true or false) :");
		boolean inputb = input.nextBoolean();
		
		System.out.print("Enter the value c (true or false) :");
		boolean inputc = input.nextBoolean();
		
		checktwoBoolean(inputa,inputb,inputc);
		
		input.close();
		
	
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input. Please enter true or false");
		}
	}

}
