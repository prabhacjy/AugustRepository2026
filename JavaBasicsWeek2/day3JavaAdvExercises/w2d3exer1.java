package day3JavaAdvExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;


public class w2d3exer1 {
	
	public static void main(String args[]) {
		// converting an array to string in java
		
		int arr[] = {10,30,40,20,60,50,70,90,80};
		int mdarr[][] = {{1,2,3},{2,1,3},{3,1,2}};
		
		// converting one dimensional integer array to the string 
		System.out.print("The integer array is :");
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		
		System.out.println();
		
		String intarrstr = Arrays.toString(arr);	
		System.out.println("Converted integer array to string array :"+intarrstr);
		System.out.println();
		
		// converting two dimensional integer array to the string 
		
         System.out.println("The 3*# Matrix 2D integer array is :");
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
			  System.out.print(" "+mdarr[i][j]);
			}
			System.out.println();
			
			}
		String strmdarr = Arrays.deepToString(mdarr);
		System.out.println("Converted 2D integer array to string array :"+strmdarr);
		System.out.println();
		
		//custom conversion of integer array to string
		
		StringBuilder sbobj = new StringBuilder();
		sbobj.append("[");
		for (int i=0; i<arr.length;i++) {
			sbobj.append(arr[i]);
			if (i < arr.length-1 ) { 
				sbobj.append(", ");
			}
			
		}
		sbobj.append("]"); //since in string the array is within [] boxes
		
		System.out.println("Custom converted int array to string array :"+sbobj.toString());
		System.out.println();
		
		// Converting String to Integer
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numeric string value :");
		String intval = input.nextLine();
		
		try
		{
			// Using the parseInt conversion method
			int num1 = Integer.parseInt(intval);
			System.out.println("Converted integer value from string using parseInt:"+num1);
			
			// Using the valueOf method returns integer object,
			//then unboxing it to Integer
			
			int num2 = Integer.valueOf(intval);
			System.out.println("Converted integer value from string using valueOf:"+num2);
			
			
		} catch (Exception e) {
			System.out.println("Invalid number format through user input: " + e.getMessage());
		}
			
		System.out.println();
		
		// Converting an integer to String
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter the integer value :");
		int intusrval = input1.nextInt();
		try
		{
			
		// conversion using toString method
		String intstrval = Integer.toString(intusrval);
		System.out.println("Converted String value of integer value using toString method :"+intstrval);
		
		//conversion using the valueOf method which returns 
		String intstrval1 = String.valueOf(intusrval);
		System.out.println("Converted String value of integer value using valueOf method :"+intstrval1);
		
		} catch (Exception e) {
			System.out.println("Invalid user input :"+e.getMessage());
		}
		
		// we can also use StringBuffer and StringBuilder to convert integer to string
		// using the .append() and the .toString method
		// Example using the StringBuffer class
		
		StringBuffer sbstr = new StringBuffer();
		sbstr.append(intusrval).toString();
		System.out.println("Converted String value of integer value using StringBuilder :"+sbstr);
		
		//using the string concatenation operator "+"
		String inttostr = "Converting int to String using + operator :"+intusrval;
		System.out.println(inttostr);
		
		/*String.format("%d", number)
       %d is the format specifier for integers. The result is a string representation of the integer.
       %05d → Pads the number with zeros to make it 5 digits (00123).
       %10d → Right-aligns the number in a field of width 10. */
		//String paddedint = String.format("%05",intusrval);
		//System.out.println("Converted String value of integer value using Stringformat padded with five zeros :"+paddedint);
		System.out.println();
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter the valid string to convert it to caharacter array :");
		String str = input2.nextLine();
		
		// conversion using the toCharArray() method
		
		char chrarr[]= str.toCharArray();
		System.out.println("The character array (using toCharArray) : ");
				for (char c: chrarr) {
			System.out.print(c+" ");
		}
				
				
				System.out.println();
		int chlen = str.length();
		char tempchr[] = new char[chlen];
		
		for (int i=0; i<str.length(); i++) {
			tempchr[i] = str.charAt(i);
			System.out.print(tempchr[i]+" ");
		}
		System.out.println();
		
		// converting string to character array using StringBuilder
		StringBuilder sblchr = new StringBuilder();
		sblchr.append(str).toString().toCharArray();
		System.out.println("Converted char array of string value using StringBuilder :"+sblchr);
		
		// find the character at the given location
		
		System.out.println();
		Scanner str2 = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str2val = str2.nextLine();
		
		Scanner loc = new Scanner(System.in);
		System.out.println("Enter the index in which character is to be located :");
		int locval = loc.nextInt();
		
		int index = locval;
		char charval = str2val.charAt(index);
		System.out.println("The charater at the index "+index+" of the string "+str2val+" is "+charval);
		
		// find the index of given character 
		System.out.println();
		String sam="Welcome to Java";
		System.out.println(sam);
		int idx = sam.indexOf('J');
		System.out.println("The character 'J' is at the index "+idx);
		
		// find the index of given substring(first character index) 
		String str11 = "Welcome to the java programming";
		String str22 = "java";
		int indx1 = str11.indexOf(str22);
		System.out.println(str11);
		System.out.println("The substring "+str22+" is found at the index "+indx1);
		
		//check whether the given substring present in the given string or not
		System.out.println(str11.contains(str22));
		
		// count the number of words in a given string sentence?
		int noofwrds = str11.trim().replaceAll("\\s+", " ").split(" ").length;
		System.out.println("The number of words in the string '"+str11+"' is "+noofwrds);
		
		// check if two strings are the same ignoring their cases. 
		
		String s1 = "welcome to java";
		String s2 = "Welcome To Java";
		System.out.println("String 1:"+s1);
		System.out.println("String 2:"+s2);
		boolean tf = s1.equalsIgnoreCase(s2);
		if (tf == true) {
		System.out.println("String 1 and string 2 are equal");
		}else
		{
			System.out.println("String 1 and string 2 are not equal");
		}
		
		
		input.close();
		input1.close();
		input2.close();
		str2.close();
		loc.close();
	
	}

	}


