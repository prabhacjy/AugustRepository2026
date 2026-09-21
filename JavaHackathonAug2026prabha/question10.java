package tekarchJavaHackathon;

import java.util.Scanner;

//Q10. What is String subSequence method?
public class question10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = input.nextLine();
	
		System.out.println("Enter the start index from which substring need to be extracted :");
		int stindx = input.nextInt();
		System.out.println("Enter the end index from which substring need to be extracted :");
		int edindx = input.nextInt();
        CharSequence subSeq = str.subSequence(stindx, edindx); // Extracts "World"
        System.out.println("The substring extracted is :"+subSeq);
        
        input.close();

	}

}
