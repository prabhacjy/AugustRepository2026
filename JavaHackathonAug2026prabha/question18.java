package tekarchJavaHackathon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Q18. WJP to display duplicate character in string
public class question18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string array :");
		String str = input.nextLine();
		
        char[] charray = str.toCharArray();
        
        Arrays.sort(charray);
        int count =0;
        System.out.println("Duplicate Characters in the string are : ");
        for (int i=0; i<charray.length-1;i++) {
        	if(charray[i] == charray[i+1]) {
        		System.out.println(charray[i]);
        		count++;
        		// loop to skip next occurrence of duplicate charater 
        		while(i<charray.length-1 && charray[i]== charray[i+1]) {
        			i++;
        		}
        	}
        }
        if (count == 0) {
        	System.out.println("No duplicate found in the string");
        }
        input.close();


	}

}

