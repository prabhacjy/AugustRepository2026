package day2JavaBasicsExercises;

public class d2exer3 {

	public static void main(String[] args) {
		// Printing the patterns using loop structures 
		// Pattern 1
		for(int j=1;j<=5;j++) {
		for(int i=1;i<=5;i++) {
			System.out.print(+i);
		}
		System.out.println();
		}

		System.out.println();
		System.out.println();
		
		// Pattern 2
		
		for(int k=5;k>=1;k--) {
			for(int l=1;l<=k;l++) {
				System.out.print(+l);
			}
			System.out.println();
			}

		System.out.println();
		System.out.println();
		
		// Pattern 3
		
		for(int k=1;k<=5;k++) {
			for(int l=1;l<=k;l++) {
				System.out.print("*");
			}
			System.out.println();
			}	
		for(int k=5;k>=1;k--) {
			for(int l=1;l<=k;l++) {
				System.out.print("*");
			}
			System.out.println();
			}	
		System.out.println();
		System.out.println();
		
		
		//Pattern 4
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=5;i++) {
				System.out.print(+j);
			}
			System.out.println();
			}
		System.out.println();
		System.out.println();
		
	// Pattern 5
		
		for(int k=5;k>=1;k--) {
			int m=1;
			for(int l=5;l>=k;l--) {
				System.out.print(+m);
				m++;
			}
			System.out.println();
			}

		System.out.println();
		System.out.println();
		
		// Pattern 6
		int iteration = 5;
		
		for(int m=1;m<=iteration;m++) {
			for(int n=iteration-1 ; n >= m; n--) {
				System.out.print(" ");
			}
			for(int p=1;p<=m;p++) {
				System.out.print("* ");
			}
			System.out.println();
			}	
		
		for(int m=1;m<=iteration;m++) {
			for(int n=1 ; n <= m; n++) {
				System.out.print(" ");
			}
			for(int p=iteration;p > m;p--) {
				System.out.print("* ");
			}
			System.out.println();
			}	

	}

}
