package tekarchJavaHackathon;

import java.util.Scanner;

//Q17.  WJP to find total number of integers, uppercase and lowercase character 
// in the give string
public class question17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String strval = input.nextLine();
		
		int uppercasecount = 0;
		int lowercasecount = 0;
		int integercount = 0;
		
		char[] character =  strval.toCharArray();
		
		// method - Character.isUpperCase(ch) - determines if the charater is uppuer case
		// method - Character.isLowerCase(ch) - determines lower case
		// method - Character.isDigit(ch) - determines the integer
		for (char ch : character) {
			if (Character.isUpperCase(ch)) {
				uppercasecount++;
			} else if (Character.isLowerCase(ch)) {
				lowercasecount++;
			} else if (Character.isDigit(ch)) {
				integercount++;
			}
		}
		
		System.out.println("Total number of uppercase characters in the string : "+uppercasecount);
		System.out.println("Total number of lowercase characters in the string : "+lowercasecount);
		System.out.println("Total number of integer characters in the string : "+integercount);

	}

}
