package tekarchJavaHackathon;

import java.util.Scanner;
//Q22. WJP to convert int to string
public class question22 {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter the integer value :");
		int intusrval = input1.nextInt();
		try
		{
			
		// conversion using toString method
		String intstrval = Integer.toString(intusrval);
		System.out.println("Converted String value of integer value using toString method :"+intstrval);
		
		//conversion using the valueOf method which returns 
		String intstrval1 = String.valueOf(intusrval);
		System.out.println("Converted String value of integer value using valueOf method :"+intstrval1);
		
		} catch (Exception e) {
			System.out.println("Invalid user input :"+e.getMessage());
		}
		
		// we can also use StringBuffer and StringBuilder to convert integer to string
		// using the .append() and the .toString method
		// Example using the StringBuffer class
		
		StringBuffer sbstr = new StringBuffer();
		sbstr.append(intusrval).toString();
		System.out.println("Converted String value of integer value using StringBuilder :"+sbstr);
		
		//using the string concatenation operator "+"
		String inttostr = "Converting int to String using + operator :"+intusrval;
		System.out.println(inttostr);
		input1.close();
		
	}

}
