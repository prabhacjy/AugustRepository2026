package day4JavaBasicsExcercises;

public class d4exer1 {

	public static void main(String[] args) {
		// Program to calculate the sum of the array elements in an 1D array
		
		int sum=0;
		int a[] = {10,20,30,40,50,60};
		int len = a.length;
		for(int i=0;i<len;i++) {
			sum = sum+a[i];
		}
		
		System.out.print("The array is :");
		for (int i=0; i<len;i++) {
        System.out.print(" "+a[i]);
		}
        System.out.println();		
		System.out.println("The sum of the array elements is "+sum);
	}

}
