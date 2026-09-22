package day4JavaBasicsExcercises;

public class d4exer8 {

	public static void main(String[] args) {
		// Program to find the average of the array elements
		   int a1[]= {90,20,40,30,70,50,60,10,80};
			
			int len=a1.length;
					
			System.out.print("The array is :");
			for (int i=0; i<len;i++) {
	        System.out.print(" "+a1[i]);
			}
			System.out.println();
			int sum = 0;
			double avg = 0;
			for (int i=0; i<len;i++) {
		        sum = sum + a1[i];
				}
			avg = sum/len;
			
        System.out.println("The average of the array elements is "+avg);
        
			
	}

}
