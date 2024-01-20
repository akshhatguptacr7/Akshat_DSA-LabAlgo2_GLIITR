package PayMoney;

import java.util.Scanner;

public class PayMoney {
    public static int findTransactionToAchieveTarget(int[] transactions, int target) {
        int currentSum = 0;
        for (int i = 0; i < transactions.length; i++) {
            currentSum += transactions[i];
            if (currentSum >= target) {
                return i + 1;  // Adding 1 to display the transaction number (1-indexed)
            }
        }
        return -1;  // Return -1 if target is not achieved
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the transaction array: ");
        int size = scanner.nextInt();
        int[] transactions = new int[size];

        System.out.print("Enter the values of the array: ");
        for (int i = 0; i < size; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.print("Enter the total number of targets: ");
        int numTargets = scanner.nextInt();

        for (int j = 0; j < numTargets; j++) {
            System.out.print("Enter the value of the target: ");
            int targetValue = scanner.nextInt();
            int result = findTransactionToAchieveTarget(transactions, targetValue);

            if (result != -1) {
                System.out.println("Target achieved after " + result + " transactions");
            } else {
                System.out.println("Given target is not achieved");
            }
        }
    }
}

