package day2JavaBasicsExercises;

import java.util.Scanner;

public class d2exer7 {

	public static void main(String[] args) {
		// Program to revise the salary of its employee based on some conditions

		Scanner experience = new Scanner(System.in);
		System.out.print("Enter the employee's experience :");
		int exp=experience.nextInt();
			
		Scanner salary = new Scanner(System.in);
        System.out.print("Enter the employee's actual salary :");
        int sal = salary.nextInt();
        
        Scanner reward = new Scanner(System.in);
        System.out.print("Enter the number of rewards the employee has received : ");
		int rwd = reward.nextInt();

		double revsal;
	    if(exp>=3 && exp<=5) {
	    	revsal =sal+(0.1*sal);
	     }else if (exp>=6 && exp<=9){
	    	 revsal = sal + (0.15*sal);
	     } else if (exp>=10 && exp<=20) {
	    	 revsal = sal +(0.2*sal);
	     } else {
	    	 revsal = sal +(0.25*sal);
	     }
	    
	    if (rwd > 0) {
	    	revsal = revsal +(rwd*1000);
	    }
	    
	    System.out.println("The employee's revised salary is "+revsal);
	    
	    experience.close();
	    salary.close();
	    reward.close();
	    
	    
	}

}
