package tekarchJavaHackathon;

import java.util.Arrays;

//Q 60. write an algorithm to reverse first 3 numbers, then next 3 numbers, 
//then next 3 numbers, the number will be  based on var k. 
//Array = [3,2,4,7,0,3,1,5,8, 4]       k=3       OutPut = [4,2,3,3,0,7,8,5,1,4]
public class question60 {
	static void reverseInGroups(int[] arr, int k){
        int n = arr.length; 

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); 

            // reverse the sub-array
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                
            }
        }
    }
    

	public static void main(String[] args) {
        int[] arr = {3,2,4,7,0,3,1,5,8, 4};
        int k = 3;
        int len = arr.length;
        
        System.out.println("Input array before sorting : ");
        for (int i=0; i<len; i++) {
        	System.out.print(arr[i]+" ");
        }

        reverseInGroups(arr, k);
        System.out.println();
        System.out.println("Array after reversing elements after every 3 indexes : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
}

