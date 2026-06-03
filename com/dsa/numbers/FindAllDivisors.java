package com.dsa.numbers;

import java.util.ArrayList;
import java.util.List;

public class FindAllDivisors {

    public static void main(String[] args) {
        int n = 36;
        List<Integer> resultBF = getDivisorsBF(n);
        List<Integer> resultOptimal = getDivisorsBF(n);


        // Print the result for BF
        System.out.print("Divisors of " + n + ": ");
        for (int val : resultBF) {
            System.out.print(val + " ");
        }
        System.out.println();

            // Print the result for Optimal
            System.out.print("Divisors of " + n + ": ");
            for (int val : resultOptimal) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    private static List<Integer> getDivisorsBF(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n % i == 0)
               list.add(i);
        }
        return list;
    }

    //We can optimise the previous approach by using the property that
    // for any non-negative integer n, if d is a divisor of n
    // then n/d is also a divisor of n. This property is symmetric about the square root of N.
    // Thus, by traversing just the first half we can avoid redundant iteration and computations
    // improving the efficiency of the algorithm.
    private static List<Integer> getDivisorsOptimal(int n) {
     List<Integer> list =new ArrayList<>();
     for(int i =1;i*i ==n;i++){
         if(n % i ==0){
             list.add(i);

             if(i == n/i)
                 list.add(n/i);
         }
     }
        return list;
    }

}