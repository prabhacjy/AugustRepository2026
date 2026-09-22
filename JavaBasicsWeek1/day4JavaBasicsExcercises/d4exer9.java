package day4JavaBasicsExcercises;

public class d4exer9 {

	public static void main(String[] args) {
		// Program to find sum of diagonal elements in a 2-D array
		
		int a[][]= {{5,1,5,6,8} , {6,7,8,9,2}, {7,5,4,3,2}, {9,8,6,5,4}, {3,3,6,9,2}};
		
		// To display the 5*5 Matrix 2D array
		
		System.out.println("5*5 Matrix 2D Array");
		System.out.println();
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
		//  To add the diagonals of the Matrix. It has two types.
		// Principal diagonal - Where the indexes are always identical ex:- 0,0 1,1 2,2 3,3.....
		// secondary diagonal - where the indexes sum to (n-1) where n is 5 if it is 5 * 5 Matrix
		
		// Principal diagonal addition
		
		int pdtot = 0;
		
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if (i==j) {
					pdtot = pdtot +a[i][j];
				}
			}
				}
		System.out.println();
		System.out.println("The sum of the principal diagonal elements are "+pdtot);
		System.out.println();
		
		// Secondary diagonal addition
		
		int adtot = 0;
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				// since it is 5*5 matrix the diagonal indices will add up to 5-1 that is 4
				if ((i+j)==4) {
					adtot = adtot +a[i][j];
				}
			}
				}

		System.out.println("The sum of the secondary diagonal elements are "+adtot);
	}

}
