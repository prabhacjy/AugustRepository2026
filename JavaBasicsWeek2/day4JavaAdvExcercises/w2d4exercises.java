package day4JavaAdvExcercises;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;

public class w2d4exercises {

	public static void main(String[] args) {
		// 1. add all the elements in the given array of size n 
		
		int arr[] = {11,42,33,33,50,61,77,90,42,80};
		int len= arr.length;
		int sum = 0;
		System.out.println("The array elements are the following :");
		for ( int i = 0; i<len; i++) {
			System.out.print(arr[i]+" ");
			sum = sum + arr[i];
		}
		System.out.println();
		System.out.println();
		System.out.println("The sum of all the elements in the array is "+sum);
		
		//2.find maximum element in the array 
		Arrays.sort(arr);
		System.out.println();
        System.out.println("The maximum element in the array is "+arr[len-1]);
        
        // 3. find unique elements in the array 
        // converting the array into a stream using Arrays.stream()
        // Applying the distinct() method to filter out duplicates
        // Applying the Arrays.toArray() method to convert it back to array
        
        int uniquearr[] = Arrays.stream(arr).distinct().toArray();
        
        // to print the unique array
        int uniqlen = uniquearr.length; 
        System.out.println();
        System.out.println("The unique array after removing the duplicates are the following");            
        for (int k=0;k <uniqlen; k++) {
        	System.out.print(uniquearr[k]+" ");
        }
        System.out.println();
        
        //4.print only even numbers in the given array
        int evenpointer = 0;
        System.out.println();
        System.out.println("The array elements which are even are the following :");
        for ( int j = 0; j<len; j++) {
			if (arr[j]%2 == 0) {
				System.out.print(arr[j]+" ");
				evenpointer++;
			}
		}
        if (evenpointer == 0) {
        	System.out.println("The array has no even element in it");
        	
        }
        
        //5. check the given string is palindrome or not
        
        System.out.println();
        Scanner inputstr = new Scanner(System.in);
        System.out.println("Enter the string to check whether it is palindrome or not :");
        String ipstr = inputstr.nextLine();
        
        StringBuilder revstr = new StringBuilder(ipstr).reverse();
        String reversed =  revstr.toString();
        boolean bv = ipstr.equalsIgnoreCase(reversed);
        if (bv == true) {
        	System.out.println("The input string is a palindrome");
        }else {
        	System.out.println("The input string is not a palindrome");
        }
   
        
        	
        //6. find the longest palindrome in the given string 
        
        //7. find the frequency of each character in the given string 
         
        
        System.out.println();
        System.out.println("Enter the string to find the frequency of its each charater :");
        String str1 = inputstr.nextLine();
        int str1len = str1.length();
        String str2 = "";
        
        // to find the unique characters in the given string and removing it by copying only unique characyes to str2
        for (int i =0; i<str1len; i++) {
        	char charcomp = str1.charAt(i);
        	//for the first character of the string
        	if (str2 == "") {
        		str2 = str2 + charcomp;
        	} else {
        	//checks whether the character is already avaible in the new string str2 being formed	
			int val = str2.indexOf(charcomp); // if found val returns -1
			if (val < 0) {
				str2 = str2 + charcomp;
			}	
        	}
        	
        	
        }
        //System.out.println(str2);
        int str2len = str2.length();
        // looping through the unique string to find how many times the character is repeated in the original string     
        for (int i =0; i<str2len; i++) {
        	
        	char chcom = str2.charAt(i);
        	int count = 0;
        	for (int j=0; j<str1len; j++) {
        		char chfreq = str1.charAt(j);
        		if (chcom == chfreq ) {
        			count ++;
        		}
        	}
        	System.out.println("Frequency of "+chcom+" is "+count);
     
        }
        
        inputstr.close();
        
        // 8. Move all even numbers to the beginning of the array.  
        int arr1[] = {11,22,33,44,55,66,77,88,42};
        int arr1len = arr1.length;
        System.out.println("The array elements are the following :");
		for ( int i = 0; i<arr1len; i++) {
			System.out.print(arr1[i]+" ");
		}
		
       for (int i = 0; i < arr1len-1 ; i++) {
			for (int j = 0; j < arr1len-1-i; j++) {
				if (arr1[j] % 2 == 0 ){
			
				} else {
					int temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
					
			}
		}
		}
       System.out.println();
       
       System.out.println("The array elements after moving the even number to the front :");
      for (int k=0;k<arr1len; k++) {
    	  System.out.print(arr1[k]+ " ");
      }
      
     // 9. Add sum of the array to each element in the array
      
      int arr2[] = {10,20,40,30,50,60,80};
      int arr2len = arr2.length;
      System.out.println();
      System.out.println("The array elements are the following :");
      int sum1 = 0;
      for ( int i = 0; i<arr2len; i++) {
    	  System.out.print(arr2[i]+" ");
    	  sum1 = sum1 + arr2[i];
      }
      System.out.println();
      System.out.println("The array elements after adding its sum to each elements are the following :");
      for ( int i = 0; i<arr2len; i++) {
    	  arr2[i] = sum1+arr2[i];
    	  System.out.print(arr2[i]+" ");
    
      }
      
      
        
       	}

}


