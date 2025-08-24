package com.dsa.sorting;

import java.util.Arrays;

class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        System.out.println("Original array:" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int pi = partition(arr, low, high);
            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Choosing the first element as pivot
        int i = low; // Index of smaller element
        int j = high; // Index of larger element

        while (i < j) {
            // Increment i until we find an element greater than the pivot
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            // Decrement j until we find an element less than or equal to the pivot
            while (arr[j] > pivot && j >= low + 1) {
                j--;

            }
            if (i < j) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        // Swap the pivot element with the element at index j
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;

    }

}
