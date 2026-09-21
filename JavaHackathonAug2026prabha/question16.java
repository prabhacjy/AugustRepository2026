package tekarchJavaHackathon;

import java.util.Scanner;

//Q16. Write a method that will remove given character from the String?
public class question16 {

	public static void main(String[] args) {
	
		Scanner stringip = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string1 = stringip.nextLine();
		int len = string1.length();
		// getting the characters form the user to be removed from the string  
		
		System.out.print("Enter the characters to be removed :");
		String charsToremove = stringip.nextLine();
		
		// checking the characters in the string whether it needs to be removed
	    // if yes it is skipped and new string is built  
		String clean = "";
		for (int i=0;i<len;i++)
		{
			char charcomp = string1.charAt(i);
			int val = charsToremove.indexOf(charcomp); // if found val returns -1
			if (val < 0) {
				clean = clean + charcomp;
			}
			
		}
		System.out.println(clean);
		stringip.close();
	}

}
