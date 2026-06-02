package com.dsa.numbers;

public class PalindromeCheck {

    public static void main(String[] args) {
        int number = 4554;
        if (palindrome(number)) { // Check if the number is a palindrome
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    private static boolean palindrome(int number) {
        int reverse = 0;
        int original = number;
        while(number > 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number/10;
        }

        return reverse == original;
    }
}
