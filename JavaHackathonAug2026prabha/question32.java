package tekarchJavaHackathon;

//Q32. You are given two sorted arrays, A and B, 
//and A has a large enough buffer at the end to hold B. 
//Write a method to merge B into A in sorted order.
public class question32 {
	
	 public static void merge(int[] arr1, int n, int[] arr2, int m) {
	        int i = n - 1;      // last valid element in arr1
	        int j = m - 1;      // last element in arr2
	        int k = n + m - 1;  // last position in arr1 (full size)

	        // Merge from the end
	        while (i >= 0 && j >= 0) {
	            if (arr1[i] > arr2[j]) {
	                arr1[k--] = arr1[i--];
	            } else {
	                arr1[k--] = arr2[j--];
	            }
	        }

	        // Copy remaining arr2 elements (if any)
	        while (j >= 0) {
	            arr1[k--] = arr2[j--];
	        }
	    }

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,0,0,0,0};
        int[] arr2 = {7,8,9,10};
        
        System.out.println("Sorted Array A with four empty space :");
        for (int i=0; i<arr1.length; i++) {
        	System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Sorted Array B with four elements :");
        for (int i=0; i<arr2.length; i++) {
        	System.out.print(arr2[i]+" ");
        }

        merge(arr1, 6, arr2, 4);
        System.out.println();
        System.out.println("Array after merging Arrays A and B :");	
        for (int x : arr1) System.out.print(x + " ");
	}

}
