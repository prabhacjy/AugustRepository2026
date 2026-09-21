package tekarchJavaHackathon;
//Q26. WJP to merge two sorted array.(Do not use third array)		
//array1[10] = 1,2,4,6,9,10		array2[4] =  3, 5,7,8		
//After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10
public class question26 {
	
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
	
		int[] arr1 = {1,2,4,6,9,10,0,0,0,0};
        int[] arr2 = {3,5,7,8};

        merge(arr1, 6, arr2, 4);
        System.out.println("Array after merging : ");
        for (int x : arr1) System.out.print(x + " ");
	}

}
