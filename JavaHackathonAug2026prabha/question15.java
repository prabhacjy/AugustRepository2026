package tekarchJavaHackathon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Q15. Given a string print the unique words of the string.
public class question15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String : ");
	    String str = input.nextLine().trim();
	    
	    if (str.isEmpty()) {
            System.out.println("Input is empty. Nothing to reverse.");
            input.close();
            return;
        }
	     
	    //split by one or more spaces using regex
	    String words[] = str.split("\\s+");
	    
        // converting the string of words to the List to find the unique words in the string 	 
	    List<String> wordsList = Arrays.asList(words);
	    System.out.println("The unique words in the String are the following :");
	    for(String word:wordsList) {
	    	
	    	// using the Collections.frequency()method to find the frequency of the occurences of the word in the list
	    	if (Collections.frequency(wordsList, word)==1) {
	    		System.out.println(word);
	    	}
	    }
	    
	    input.close();
	}

}
