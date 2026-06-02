package com.dsa.numbers;

public class ArmstrongCheck {

    public static void main(String[] args) {
        int number = 153;

        // Use class method to check
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    private static boolean isArmstrong(int number) {
        int k = String.valueOf(number).length();
        int sum = 0;
        int duplicate = number;

        while(number > 0){
            int lastDigit = number% 10;
            sum += Math.powExact(lastDigit,k);
            number = number/10;
        }
        return sum == duplicate;
    }
}
