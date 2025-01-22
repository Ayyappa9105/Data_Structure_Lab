import java.util.*;
class QuickSort {
    // Method to perform the partitioning logic
    public static int partition(int[] a, int low, int high) {
        int pivot = a[low]; // Using the first element as pivot
        int i = low + 1; // Start at the next element
        int j = high;
        
        while (i <= j) {
            // Move i to the right as long as a[i] < pivot
            while (i <= high && a[i] < pivot) {
                i++;
            }
            // Move j to the left as long as a[j] > pivot
            while (j >= low && a[j] > pivot) {
                j--;
            }
            // Swap elements if i < j
            if (i < j) {
                swap(a, i, j);
            }
        }
        // Finally, swap the pivot element with a[j]
        swap(a, low, j);
        return j; // Return the index of the pivot element
    }

    // Swap method to swap elements at indices i and j
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Method to recursively apply the quicksort algorithm
    public static void quicksort(int[] a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high); // Get the pivot index
            quicksort(a, low, pivotIndex - 1); // Sort the left part
            quicksort(a, pivotIndex + 1, high); // Sort the right part
        }
    }

    // Main function to test quicksort
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter array size:");
    	int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        quicksort(arr, 0, arr.length - 1);

        System.out.println("sorted array");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
/* output: 
enter array size:
5
enter the array elements:
20 50 10 80 90
sorted array:
10 20 50 80 90
  */
