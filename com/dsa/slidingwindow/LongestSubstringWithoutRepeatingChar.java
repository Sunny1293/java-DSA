package com.dsa.slidingwindow;
class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + length);
    }

    private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        int[] charIndex = new int[256]; // Assuming ASCII characters

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            // If the character is already in the current substring
            if (charIndex[currentChar] > left) {
            // update the left pointer to the next index of that character
                left = charIndex[currentChar];
            }
            charIndex[currentChar] = right + 1; // Store the next index of the character
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

}
