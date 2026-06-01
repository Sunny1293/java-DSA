package com.dsa.numbers;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 12345;
        int reverseNum = reverseNumber(num);
        System.out.println(reverseNum);  // Output: 54321
    }

    private static int reverseNumber(int num) {
        int rev = 0;

        while(num > 0){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num/10;
        }

        return  rev;
    }


}
