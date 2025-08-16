package com.slidingwindow;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
        int k = 3; // No flips allowed
        int maxLength = findMaxConsecutiveOnes(nums,k);
        System.out.println("Maximum consecutive ones: " + maxLength);
    }

    private static int findMaxConsecutiveOnes(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            // If we have more than k zeros, move the left pointer
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Calculate the maximum length of the subarray with at most k zeros
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

}
