package day1JavaAdvExcercises;

public class d1exer1 {

	static void swap1() {
		
		int num1 = 30;
		int num2 = 40;
		
		System.out.println("Swap using third variable");
		
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
    static void swap2( ) {
		
           System.out.println("Swap without using third variable");
		
		int a = 10, b = 20;

		System.out.println("Before the Swap");
		System.out.println("a = " + a + ", b = " + b);

		
		a = a + b; 
		b = a - b; 
		a = a - b; 

		System.out.println("After the Swap");
		System.out.println("a = " + a + ", b = " + b);

	}
	public static void main(String[] args) {
		// Program to swap two number with and without using third variable 
		
	    swap1();
	
		swap2();
		

	}

}
