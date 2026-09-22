package day4JavaBasicsExcercises;

public class d4exer10 {

	public static void main(String[] args) {
		// Program to display the upper halve of the matrix in 2-D array
     int a[][]= {{1,2,3,4} , {3,2,7,6}, {5,7,8,9}, {8,6,5,4}};
		
		// To display the 4*4 Matrix 2D array
		
		System.out.println("4*4 Matrix 2D Array");
		System.out.println();
		for (int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
			
			}
		
		// To display the first half of the matrix
		int numofrow = 0;
		for (int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if (i==0) {
					numofrow++;
					
				}
			}
						
			}
		System.out.println();
		System.out.println("Total number of rows in the 4*4 Matrix is "+numofrow);
		System.out.println();
		int halfofmat = numofrow/2;
		System.out.println("The first half of the 4*4 Matrix displaying only first "+halfofmat+" rows");
		System.out.println();
		for (int i=0; i<halfofmat; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
			
			}
		
	}

}
