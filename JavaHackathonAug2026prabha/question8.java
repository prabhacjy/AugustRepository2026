package tekarchJavaHackathon;

import java.util.Scanner;

//Q8.	How can we make String upper case to lower case?
public class question8 {

	public static void main(String[] args) {
		
		
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the string in upper case letters: ");
	  String str = input.nextLine();
	 
	 System.out.println("Converting the String to Lowercase");
	 System.out.println("The string is : "+str.toLowerCase());
	 
	 input.close();

	}

}
