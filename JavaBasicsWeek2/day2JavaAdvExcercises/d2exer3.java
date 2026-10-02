package day2JavaAdvExcercises;

public class d2exer3 {

	public static void main(String[] args) {
		// Program to use wrapper class methods 
		
		//convert a string to int
		//String numstr = "dfgbdfb";  if we assign characters it cannot parse to int throws NumberFormatException
		String numstr = "1234";
		System.out.println("The String value :"+numstr);
		int num = Integer.parseInt(numstr);
		System.out.println("After converting string to integer :"+num);
		
		//Boxing integer data type int into Wrapper class Integer to add more functions to it 
		
		//Primitive Integer
		int number = 11;
		Integer wrappernum = number; // Auto boxing int to Integer and wrappernumber followed by dot (.) displays different function
		System.out.println("The Wrapper class Integer "+wrappernum);
		
		//converting the integer to float
		int numbersamp = 100;
		//float floatnum = Float.parseFloat(numbersamp); - we cannot idrectly convert a integer to float
		// we can use Float.valueOf(integer variable); for converting primitive int to Float
		Float floatval = Float.valueOf(numbersamp);
		System.out.println("Converting integer to float :"+numbersamp);
		
		Float fltval = Float.valueOf(wrappernum);
		System.out.println("Converting Wrapper class integer value to float :"+fltval);
		
		Integer number1 = 100;
		Float fltval1 = Float.valueOf(number1.intValue()); // number1.intValue() converts the Wrapper class Integer to primitive integer 
		// further the Float.valueOf() converts the int and returns the Float object 
		System.out.println("Converting Primitive integer value to float :"+fltval1);
		
		int numbr1 = 10;
		int numbr2 = 20;
		System.out.println("The max of two number " +Math.max(numbr1, numbr2));
		System.out.println("The min of two number " +Math.min(numbr1, numbr2));

	}

}
