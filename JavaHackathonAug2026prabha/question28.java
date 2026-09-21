package tekarchJavaHackathon;

import java.util.Scanner;

//Q28. WJP to find factorial of a number using recursion
public class question28 {
	
	public static long findFactorial(int num) {
		if (num==0 || num ==1) {
			return 1;
		}else {
			return (num*findFactorial(num-1));
		}
		
	}

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to find its factorial : ");
		int num = input.nextInt();
		
		long factorial = findFactorial(num);
		System.out.println("The factorial of "+num+" is "+factorial);

	}

}
