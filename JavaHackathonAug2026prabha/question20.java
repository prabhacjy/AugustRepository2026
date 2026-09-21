package tekarchJavaHackathon;

//Q20. WJP to find total number of repeated integers, uppercase and 
//lowercase character in the give string 
import java.util.Scanner;

public class question20 {

	public static void main(String[] args) {
		//String s = "aA11BbccD2d";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = input.nextLine();
		
		//By using new int[256], you can store a frequency count 
		//for each possible ASCII character in a single array
        int[] freq = new int [256]; // ASCII frequency table

        //freq['a']++; // increments count for ASCII value of 'a'
        //freq['e']++; // increments count for ASCII value of 'e'
        for (char ch : s.toCharArray()) {
            freq[ch]++;
                   }

        int repeatedInteger = 0;
        int repeatedUpper = 0;
        int repeatedLower = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                char ch = (char) i;
                if (Character.isDigit(ch)) repeatedInteger++;
                else if (Character.isUpperCase(ch)) repeatedUpper++;
                else if (Character.isLowerCase(ch)) repeatedLower++;
            }
        }

        System.out.println("Repeated integers: " + repeatedInteger);
        System.out.println("Repeated uppercase letters: " + repeatedUpper);
        System.out.println("Repeated lowercase letters: " + repeatedLower);
        
        input.close();
	}

}
