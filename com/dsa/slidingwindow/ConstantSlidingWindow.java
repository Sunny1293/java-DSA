package com.dsa.slidingwindow;
import java.util.Arrays;

class ConstantSlidingWindow {

    public static void main(String[] args) {
        //Maximum Sum Subarray of Size K	
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        int k = 3; // Size of the sliding window
        System.out.println("Original array: " + Arrays.toString(arr));
        int result = maxSum(arr, k);
        System.out.println("Resulting array: " +result);
    }

    private static int maxSum(int[] arr, int k) {
        if (arr.length < k) {
            throw new IllegalArgumentException("Array length must be at least k");
        }

        int windowSum = 0;
        int n = arr.length;
        int left = 0;
        int right = k - 1;
        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        // Initialize maxSum with the first window's sum
        int maxSum = windowSum;

        // Slide the window over the rest of the array
        while (right < n - 1) {
            // Add the next element in the window
            right++;
            windowSum += arr[right];
            // Remove the element that is sliding out of the window
            windowSum -= arr[left];
            left++;
            // Update maxSum if the current window's sum is greater
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
            
        }

        return maxSum;
    }

}
