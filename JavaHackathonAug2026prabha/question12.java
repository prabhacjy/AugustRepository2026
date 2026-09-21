package tekarchJavaHackathon;

import java.util.Arrays;
import java.util.Scanner;

//Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?
public class question12 {

	public static void main(String[] args) throws Exception {
	
		System.out.println("1. To check palindrome of the numbers.");
		System.out.println("1. To check palindrome of the string.");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter which options you want to perform(1 or 2) ?");
	
		try
		{
			int val = input.nextInt();
			
			switch (val) {
			
			case 1:
				System.out.println();
				System.out.print("Enter the size of the number array :");
				int arrsize = input.nextInt();
				System.out.println("Enter the integer array elements :");
				int array[] = new int[arrsize];
				for(int i =0; i<arrsize;i++) {
					System.out.print("Element ["+i+"] : ");
					array[i] = input.nextInt();
				}
				
				System.out.println("The integer array elemnets are the following :");
				for(int i =0; i<arrsize;i++) {
					System.out.print(array[i]+" ");
				
				}
				
				int revarray[] = new int[arrsize];
				int count = 0;
				for(int j=arrsize-1; j>=0; j--) {
					revarray[count] = array[j];
					count++;
				}
				System.out.println();
				System.out.println("The integer array elemnets after reversing are the following :");
				for(int i =0; i<arrsize;i++) {
					System.out.print(revarray[i]+" ");
				
				}
				
				boolean isequal = false;
				
				isequal = Arrays.equals(array,revarray);
				
				System.out.println();
				
				if (isequal) {
					System.out.println("The numbers in the integer array is a palindrome.");
				} else {
					System.out.println("The numbers in the integer array is not a palindrome");
				}
					
				input.close();
				
				break;
			
			case 2:
				System.out.println();
				Scanner inpstr = new Scanner(System.in);
				System.out.println("Enter the string to check for palidrome :");
				String str = inpstr.nextLine();
				
						
				StringBuilder revstr = new StringBuilder(str).reverse();
		        String reversed =  revstr.toString();
		        boolean bv = str.equalsIgnoreCase(reversed);
		        if (bv == true) {
		        	System.out.println("The input string is a palindrome");
		        }else {
		        	System.out.println("The input string is not a palindrome");
		        }
		        
		        inpstr.close();
				break;
				
			default:
				System.out.println("Invalid Option");
			}
			
		}catch (Exception e) {
	    	 System.out.println("Invalid input : "+e.getMessage()+" Try options 1 or 2.");
	     }
		

	}

}
