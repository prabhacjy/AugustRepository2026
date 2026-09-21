package tekarchJavaHackathon;

//Q7.	What are different ways to create String Object?

public class question7 {

	public static void main(String[] args) {
		
		//string created using the literal way
		String str1 = "sample"; // Stored in String Constant Pool
		String str2 = "sample"; // Reuses the same object from the pool
		System.out.println("Strings created using the literal way :");
		System.out.println("String 1 ="+str1);
		System.out.println("String 2 ="+str2);
		System.out.println("Both string uses the same references in the string constant pool :"+(str1 == str2)); // true, as both refer to the same object
		
		//string created using object way using the keyword new
		System.out.println("Strings created using the Object way :");
	    String str3 = new String("sample"); // Creates a new object in the heap
		String str4 = new String("sample"); // Creates another new object in the heap
		System.out.println("String 3 ="+str3);
		System.out.println("String 4 ="+str4);
		System.out.println("Both strings uses the same reference :"+(str3 == str4)); // false, as they are different objects
	

	}

}
