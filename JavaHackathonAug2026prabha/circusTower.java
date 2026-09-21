package tekarchJavaHackathon;

import java.util.TreeMap;
import java.util.Map.Entry;

// Q33. A circus is designing a tower routine consisting of people standing atop 
//one another’s shoulders. For practical and aesthetic reasons, each person must be 
//both shorter and lighter than the person below him or her. 
//Given the heights and weights of each person in the circus, 
//You are given two sorted arrays, A and B, and A has a large enough buffer 
//at the end to hold B. Write a method to merge B into A 
//in sorted orderwrite a method to compute the largest possible number of people 
//in such a tower. 
//EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)
//Output: The longest tower is length 6 and includes from top to bottom: (56, 90) 
//(60,95) (65,100) (68,110) (70,150) (75,190)
public class circusTower {

	public static void main(String[] args) {
		
		TreeMap <Integer,Integer> tm1 = new TreeMap<Integer,Integer>();
		tm1.put(65,100);
		tm1.put(70,150);
		tm1.put(56,90);
		tm1.put(75,190);
		tm1.put(60,95);
		tm1.put(68,110);
	
		int len = tm1.size();
		System.out.println("The longest tower length from top to bottom : "+len);
		System.out.println("(ht , wt)");
	
		for ( Entry<Integer,Integer> data:tm1.entrySet()) {
			System.out.println("("+data.getKey()+" , "+data.getValue()+")");
			
		}

	}

}
