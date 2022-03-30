package com.bridgelabz;

public class MergeSort {
    public static void main(String args[])	{
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        printArray(arr);
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
        System.out.println("\nSorted array");
        printArray(arr);
    }
    void merge(int arr[], int l, int m, int r)	{		// Merges two subarrays of arr[].	First subarray is arr[l..m]	Second subarray is arr[m+1..r]
        int n1 = m - l + 1;								// Find sizes of two subarrays to be merged
        int n2 = r - m;
        int L[] = new int [n1];							/* Create temp arrays */
        int R[] = new int [n2];
        for (int i=0; i<n1; ++i)					/*Copy data to temp arrays*/
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
        int i = 0, j = 0;								/* Merge the temp arrays */	// Initial indexes of first and second subarrays
        int k = l;										// Initial index of merged subarray array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])	{
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {							/* Copy remaining elements of L[] if any */
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {								/* Copy remaining elements of R[] if any */
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int l, int r) {					// Main function that sorts arr[l..r] using	merge()
        if (l < r) {
            int m = (l+r)/2;							// Find the middle point
            sort(arr, l, m);						// Sort first and second halves
            sort(arr , m+1, r);
            merge(arr, l, m, r);					// Merge the sorted halves
        }
    }
    static void printArray(int arr[]) {					/* A utility function to print array of size n */
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
