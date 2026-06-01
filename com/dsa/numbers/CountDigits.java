package com.dsa.numbers;

public class CountDigits {

    public static void main(String[] args) {
        int n = 329823;
        System.out.println("Number: " + n);
        int digits = countDigitsBF(n);
        System.out.println("Number of Digits in Number: " + digits);
        int nofdigits = countDigitsOptimal(n);
        System.out.println("Number of Digits in Number: " + digits);
    }

    private static int countDigitsBF(int n) {
        int count = 0;

        while(n > 0){
            count++;
            n = n/10;
        }
        return  count;
    }

    private static int countDigitsOptimal(int n) {
        int count = (int) Math.log10(n + 1);
        return  count;
    }
}
