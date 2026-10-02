package day3JavaAdvExercises;

import java.util.Scanner;
import java.lang.String;

public class w2d3exer2 {

	public static String enterstring()
	{
		Scanner strinp = new Scanner(System.in);
		System.out.print("Enter the String :");
		String strval1 = strinp.nextLine();
		return strval1;
		
	}
	
	public static void removechar()
	{
		String string1 = enterstring();
		int len = string1.length();
		// getting the characters form the user to be removed from the string  
		Scanner charinp = new Scanner(System.in);
		System.out.print("Enter the characters to be removed :");
		String charsToremove = charinp.nextLine();
		
		// checking the characters in the string whether it needs to be removed
	    // if yes it is skipped and new string is built  
		String clean = "";
		for (int i=0;i<len;i++)
		{
			char charcomp = string1.charAt(i);
			int val = charsToremove.indexOf(charcomp); // if found val returns -1
			if (val < 0) {
				clean = clean + charcomp;
			}
			
		}
		System.out.println(clean);
	}
	
	public static void removewhitespace()
	{
		String string1 = enterstring();
		String strwspa = string1.replaceAll("\\s","");
		System.out.println(strwspa);
	}
	
	public static void capitalisefstlet()
	{
		String string1 = enterstring();
		String words[] = string1.split("\\s"); //splits the string into a group of words array
		//System.out.println(words);
		
		StringBuilder sbwords = new StringBuilder();
		
		for (String word:words ) {
			//capitalize the first letter at the index 0
			//appending the rest of the words from index 1 since index 0 is capitalised already
			// appending the space "  " between words 
			sbwords.append(Character.toTitleCase(word.charAt(0))).append(word.substring(1)).append(" ");
		}
		System.out.println(sbwords.toString().trim());
	}
		
		
	
	
	public static void findsubstring()
	{
		String string1 = enterstring();
		String wrds[] = string1.split("\\s");
		
		StringBuilder sbwrds = new StringBuilder();
		
		for (String word:wrds) {
	        sbwrds.append(word);
		    System.out.println(sbwrds);
		}
	}
	
	public static void rotationtxt()
	{
		// example : "aana" is rotation of "naaa"
		// if we concatenate both the string if it is rotation we can locate the second string in the concatenated string
		String string1 = enterstring();
		Scanner antstr = new Scanner(System.in);
		System.out.print("Enter another string to check for rotation :");
		String anstr = antstr.nextLine(); 
		
		int s1len = string1.length();
		int s2len = anstr.length();
		
		if (s1len != s2len) {
			System.out.println("The given string is not a rotation");
			return;
			
			}
		
		String s3string = string1+anstr;
		
		int avail = s3string.indexOf(anstr);
		
		if (avail == -1) {
			System.out.println("The given string is not a rotation");
		} else
		{
			System.out.println("The given string is a rotation");
		}
		
		antstr.close();
	}
	
	public static void main(String[] args) throws Exception {

     System.out.println("1. To remove given characters from the string");
     System.out.println("2. To remove all the white spaces from the given string");
     System.out.println("3. To capitalize the first letter of each word in a given string");
     System.out.println("4. To find all the substring of the given string");
     System.out.println("5. To check if a given text is a rotation of another text");
     System.out.println();
     Scanner inputval = new Scanner(System.in);
     System.out.print("Enter which option (1 to 5) you want to perform ? ");
     try
     {
     int ipval = inputval.nextInt();
     switch(ipval) {
     case 1:
    	 removechar();
    	 break;
     case 2:
    	 removewhitespace();
    	 break;
     case 3:
    	 capitalisefstlet();
    	 break;
     case 4:
    	 findsubstring();
    	 break;
     case 5:
    	 rotationtxt();
    	 break;
    default:
    	System.out.println("Invalid Option");
	}
     
     } catch (Exception e) {
    	 System.out.println("Invalid input : "+e.getMessage()+" Try options 1,2,3,4, or 5");
     }
   
     System.out.println();
	}
	
	
		
}

	
     
    


