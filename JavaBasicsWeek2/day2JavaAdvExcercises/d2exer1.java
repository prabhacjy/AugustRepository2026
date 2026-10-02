package day2JavaAdvExcercises;

import java.util.Scanner;

public class d2exer1 {

	public static void findconsecutive(int num) {
		
		 int sum=0,j=0;
         for(int i=1;i<num;i++)
         {
             sum=i;
             j=i+1;
             while(sum<num)
             {
             sum=sum+j;
             j++;
             }
             
             if(sum==num)
             {
            	for(int k=i;k<j;k++)
         
            	 {
            		 
                 if(k==i)
                     System.out.print(k);
                 else
                     System.out.print(" + "+k);
            	 }
            	 System.out.println();
            	 
             }
         }
         
	}
	
	
	public static void main(String[] args) {
		//  program which inputs a positive natural number N and prints the possible consecutive number
	   // combinations, which when added give N.
		
		
		Scanner userip = new Scanner(System.in);
		System.out.print("Enter the positive number :");
		int num = userip.nextInt();
	     findconsecutive(num);
	
	     userip.close();
	     
             

	}

}
