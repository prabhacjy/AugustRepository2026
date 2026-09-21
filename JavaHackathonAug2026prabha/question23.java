package tekarchJavaHackathon;

import java.util.InputMismatchException;
import java.util.Scanner;
//Q23. WJP to differentiate input as string, int or bool
public class question23 {
	
	public static void main(String args[]) throws InputMismatchException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input :");
		
		String obj = input.nextLine(); // or scanner.nextBoolean()
		if (obj.matches("\\d+")) {
		    System.out.println("Integer");
		} else if (obj.equalsIgnoreCase("true") || obj.equalsIgnoreCase("false")) {
		    System.out.println("Boolean");
		} else {
		    System.out.println("String");
		}
		input.close();
	}

}
