package com.dsa.sorting;
import java.util.Arrays;

class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    

    private static void selectionSort(int[] arr) {
        // Traverse through all array elements
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the minimum is the first element of the unsorted part
            int minIndex = i;
            // Find the minimum element in unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
