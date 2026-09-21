package tekarchJavaHackathon;

import java.util.Scanner;
//Q9.	How can we make String Lower case to Upper case?
public class question9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string in lower case letters: ");
		String str = input.nextLine();
		System.out.println("Converting the String to UpperCase");
		System.out.println("The string is : "+str.toUpperCase());
		 
		input.close();

	}

}
