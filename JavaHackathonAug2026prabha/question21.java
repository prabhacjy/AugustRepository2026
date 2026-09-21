package tekarchJavaHackathon;

//Q21. WJP to convert string to int
import java.util.Scanner;

public class question21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numeric string value :");
		String intval = input.nextLine();
		
		try
		{
			// Using the parseInt conversion method
			int num1 = Integer.parseInt(intval);
			System.out.println("Converted integer value from string using parseInt:"+num1);
			
			// Using the valueOf method returns integer object,
			//then unboxing it to Integer
			
			int num2 = Integer.valueOf(intval);
			System.out.println("Converted integer value from string using valueOf:"+num2);
			
			
		} catch (Exception e) {
			System.out.println("Invalid number format through user input: " + e.getMessage());
		}
			
		System.out.println();
		
	}

}
