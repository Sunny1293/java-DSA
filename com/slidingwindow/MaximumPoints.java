package com.slidingwindow;

//Maximum Points You Can Obtain from Cards

/*Given N cards arranged in a row, each card has an associated score denoted by the cardScore array.
Choose exactly k cards. In each step, a card can be chosen either from the beginning or the end of the row. 
The score is the sum of the scores of the chosen cards.
Return the maximum score that can be obtained.*/

public class MaximumPoints {
    public static void main(String[] args) {
        // Example usage
        int[] cardScores = {5, 4, 1, 8, 7, 1, 3 };
        int k = 3; // Number of cards to choose
        int maxPoints = maxScore(cardScores, k);
        System.out.println("Maximum points: " + maxPoints);
    }

    private static int maxScore(int[] cardScore, int k) {
        int n = cardScore.length;
        int maxPoints = 0, lSum = 0, rSum = 0, rIndex = n - 1;
        for (int i = 0; i < k; i++) {
            lSum += cardScore[i];
        }
        maxPoints = lSum;

        for (int i = k - 1; i >= 0; i--) {
            lSum = lSum - cardScore[i];
            rSum = rSum + cardScore[rIndex];
            rIndex--;
            maxPoints = Math.max(maxPoints, lSum + rSum);
        }
        return maxPoints;
    }

}
