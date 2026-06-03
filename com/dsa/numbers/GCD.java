package com.dsa.numbers;

public class GCD {

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcdBF = findGcdBF(n1, n2);
        int gcdBA = findGcdBF(n1, n2);
        int gcdEA = findGcdBF(n1, n2);


        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcdBF);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcdBA);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcdEA);



    }

    private static int findGcdBF(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1,n2); i++) {
            if(n1 % i == 0 && n2 % i == 0){
                gcd =i;
            }
        }
        return gcd;
    }

    private static int findGcdBA(int n1, int n2) {
        int gcd = 1;
        for (int i = Math.min(n1,n2); i > 0; i++) {
            if(n1 % i == 0 && n2 % i == 0){
                gcd =i;
            }
        }
        return gcd;
    }

    //Euclidean Algorithm:
    //The Euclidean Algorithm is a method for finding the GCD of two numbers.
    //It operates on the principle that the GCD of two numbers remains the
    //same even if the smaller number is subtracted from the larger number.
    //
    //To find the GCD of n1 and n2 where n1 > n2:
    //1. Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
    //2. Once one becomes 0, the other is the GCD of the original numbers.
    private static int findGcdOptimal(int n1, int n2) {

        while(n1>0 && n2>0){
            if(n1 > n2){
                n1 = n1%n2;
            }else{
                n2 = n2%n1;
            }
        }
        if (n1==0){
            return  n2;
        }
        return n1;
    }
}
