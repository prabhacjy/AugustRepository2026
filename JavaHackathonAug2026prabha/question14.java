package tekarchJavaHackathon;

import java.util.Scanner;

//Q14. Given a string print the reverse of the words string.
// (Input:  Java Code Output: Code Java)
public class question14 {

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
	    
	    StringBuilder sbreversed = new StringBuilder();
	    int wordlen = words.length;
	    
	    for (int i = wordlen-1 ; i>= 0; i--) {
	    	sbreversed.append(words[i]);
	    	if(i>0) {
	    		sbreversed.append(" ");
	    	}
	    }
	    
	    System.out.println("The reversed words in the string are :"+sbreversed.toString());
	    

	    input.close();


	}

}
