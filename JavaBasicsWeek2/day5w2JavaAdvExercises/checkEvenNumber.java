package day5w2JavaAdvExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

//customized exception for Odd numbers extending the real Exception class
  class OddNumException extends Exception {
		public OddNumException(String message) {
			super(message); // pass message to parent exception class
		}
  }
		
		
public class checkEvenNumber {
	
	
	public static void validateEvent(int number) throws OddNumException  {

		if (number % 2 != 0) {
			//user defined exception message and the keyword "throw" explicitly create and send exception during program execution 
			throw new OddNumException("You have entered odd number, please enter an even number.");
		}
		
	}

	public static void main(String args[]) {
	
	Scanner ipnum = new Scanner(System.in);
	while (true) { // This allows the user to input again and again (forever loop)
	
	System.out.print("Enter an even number :");
	try {
		
		int ipnumval = ipnum.nextInt();
		validateEvent(ipnumval);
		
		System.out.println("You entered an even number. ");
		break; // this is needed to end the forever loop (when user entered an even number)
		
		} catch (InputMismatchException e) { // since the ipnum is integer type if string is passed it throws Input mismatch exception
			
			System.out.println("Invalid Input. Please try again and enter an integer.");
			ipnum.next(); //clears all invalid inputs from the buffer
			} catch(OddNumException e) { // the method "validateEvent" is an user defined exception  
				System.out.println(e.getMessage()); //returns the detailed message string associated with an exception or error object, which was set when the exception was created else returns NULL
				}
	
	}
	ipnum.close();
	
	
}
}

	

	
	
	
	
	
	
	

	




			
