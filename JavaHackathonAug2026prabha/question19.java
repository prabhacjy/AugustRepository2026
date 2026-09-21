package tekarchJavaHackathon;

import java.util.Scanner;

//Q19. WJP to display number of occurrence of all character
public class question19 {

	public static void main(String[] args) {
		
		Scanner inputstr = new Scanner(System.in);
		System.out.println("Enter the string to find the frequency of its each charater :");
	    String str1 = inputstr.nextLine();
	    int str1len = str1.length();
	    String str2 = "";
	        
	    // to find the unique characters in the given string and removing it by copying only unique characyes to str2
	    for (int i =0; i<str1len; i++) {
	      	char charcomp = str1.charAt(i);
	      	//for the first character of the string
	       	if (str2 == "") {
	       		str2 = str2 + charcomp;
	       	} else {
	       	//checks whether the character is already avaible in the new string str2 being formed	
		    int val = str2.indexOf(charcomp); // if found val returns -1
			if (val < 0) {
				str2 = str2 + charcomp;
				}	
	        	}
	        	
	        	
	        }
	        //System.out.println(str2);
	        int str2len = str2.length();
	        // looping through the unique string to find how many times the character is repeated in the original string     
	        for (int i =0; i<str2len; i++) {
	        	
	        	char chcom = str2.charAt(i);
	        	int count = 0;
	        	for (int j=0; j<str1len; j++) {
	        		char chfreq = str1.charAt(j);
	        		if (chcom == chfreq ) {
	        			count ++;
	        		}
	        	}
	        	System.out.println("Number of occurrences of "+chcom+" in the string is "+count);
	     
	        }
	        
	        inputstr.close();

	}

}
