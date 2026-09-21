package tekarchJavaHackathon;

//Q11. How to Split String in java?
import java.util.Scanner;

public class question11 {

	public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter the String (seperated by space) : ");
      
      String str = input.nextLine();
      String[] words = str.split(" ");
      
      System.out.println("The following are the substring of the string : ");
      for (String word : words) {
    	  System.out.println(word);
    	  
      }
      input.close();


	}

}
