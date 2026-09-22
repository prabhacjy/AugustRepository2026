package day1JavaBasicExcercise;

public class excercise5 {

	public static void main(String[] args) {
		// Swapping two variables 
		
		int num1 = 30;
		int num2 = 40;
		
		System.out.println("Before the swap");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.println("After the swap");
		int num3 = num1 + num2;
		num1 = num3 - num1;
		num2 = num3 - num2;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
	}

}
 