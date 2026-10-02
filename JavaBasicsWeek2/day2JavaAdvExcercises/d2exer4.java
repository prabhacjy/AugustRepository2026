package day2JavaAdvExcercises;

public class d2exer4 {

	public static void main(String[] args) {
		// Program to demonstrate the bubble sort 
		
		int arr[] = {13,14,12,11,10,19,18,16,17};
		
		System.out.println("The array before sorting :");
		for (int icrementor : arr) {
			System.out.print(icrementor + " ");
			
		}
		
		// Bubble sort checks the first element with the next adjacent element if it is bigger it swaps the position
		// Then it compares the second element to the third and goes on until it sorts the entire array
		
		int len = arr.length;
		
		for (int i = 0; i < len-1 ; i++) {
			for (int j = 0; j < len-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					// swapping the values using temporary variable
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("The array after bubble sorting :");
		for (int incr : arr) {
			System.out.print(incr + " ");
		}

	}

}
