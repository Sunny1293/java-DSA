package com.dsa.sorting;
import java.util.Arrays;

class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Original array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        // Traverse through 1 to n
        for (int i = 1; i < n; i++) {
            // The element to be inserted
            int key = arr[i];
            // Find the position where key should be inserted
            int j = i - 1;
            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift element
                j--;
            }
            arr[j + 1] = key; // Insert key
        }

    }
}