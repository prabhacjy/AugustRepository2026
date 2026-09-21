package tekarchJavaHackathon;

import java.util.Scanner;

//Q13. Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)

public class question13 {
	
	public static void main(String args[]) {
		
		Scanner inpstr = new Scanner(System.in);
		System.out.print("Enter the string to be reversed : ");
		String str = inpstr.nextLine();
		
				
		StringBuilder revstr = new StringBuilder(str).reverse();
        String reversed =  revstr.toString();
        
        System.out.println("The reversed string is :"+reversed);
        inpstr.close();
        
	}

}
