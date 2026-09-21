package tekarchJavaHackathon;

import java.util.Scanner;

//Q27. WJP to perform ascending order Quick sort
public class question27 {
	int partition(int a[], int low, int high)
    {
        int pivot = a[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
          
            // If current element is smaller than or
            // equal to pivot
            if (a[j] <= pivot)
            {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()
      a[] --> Array to be sorted,
      l  --> Starting index,
      h  --> Ending index */
    void sort(int a[], int l, int h)
    {
        if (l < h)
        {
            int pi = partition(a, l, h);

            // Recursively sort elements before
            // partition and after partition
            sort(a, l, pi-1);
            sort(a, pi+1, h);
        }
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = input.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Element ["+i+"] : ");
			a[i]=input.nextInt();
		}
		
		System.out.println("Array before sorting : ");
		for (int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
        question27 ob = new question27();
        ob.sort(a, 0, n-1);
        
        System.out.println();

        System.out.println("Array after quicksort :");
        for (int i=0; i<n; ++i) {
            System.out.print(a[i]+" ");}
        
    

	}

}
