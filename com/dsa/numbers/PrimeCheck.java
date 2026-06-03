package com.dsa.numbers;

public class PrimeCheck {

    public static void main(String[] args) {
        int n = 1483;

        boolean isPrimeBF = checkPrimeBF(n);

        if (isPrimeBF) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        boolean isPrimeOptimal = checkPrimeOptimal(n);
        if (isPrimeOptimal) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

    }

    private static boolean checkPrimeBF(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count == 2;
    }

    private static boolean checkPrimeOptimal(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;

       // If n is not a perfect square, count its reciprocal factor
            if (n/i != i)
                count++;
            }
        }
        return count == 2;
    }

}
