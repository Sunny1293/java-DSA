package com.dsa.numbers;

import java.util.ArrayList;
import java.util.Collections;

public class ExtractDigits {

    public static void main(String[] args) {
        int n = 329823;
        System.out.println("Number: " + n);
        ArrayList<Integer> digits = extractDigits(n);
        System.out.print("Extracted Digits: ");
        for(int num : digits){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static ArrayList<Integer> extractDigits(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0) {
            int lastDigit = n % 10;
            list.add(lastDigit);
            n= n/10;
        }
        Collections.reverse(list);
        return  list;
    }

}
