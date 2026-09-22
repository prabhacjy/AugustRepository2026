package day2JavaBasicsExercises;

public class d2exer6 {

	public static void main(String[] args) {
		// Swap two variable without using third variable 
		int a = 10, b = 20;

		System.out.println("Before Swapping:");
		System.out.println("a = " + a + ", b = " + b);

		
		a = a + b; 
		b = a - b; 
		a = a - b; 

		System.out.println("After Swapping:");
		System.out.println("a = " + a + ", b = " + b);

	}

}
