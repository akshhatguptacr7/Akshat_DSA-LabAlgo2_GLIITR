package CurrencyDenominations;

import java.util.*;

public class PaymentApproach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of currency denominations: ");
        int size = scanner.nextInt();
        int[] denominations = new int[size];

        System.out.println("Enter the currency denominations value:");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();

        // Sorting the denominations in descending order
        Arrays.sort(denominations);
        int[] sortedDenominations = new int[size];
        for (int i = 0; i < size; i++) {
            sortedDenominations[i] = denominations[size - i - 1];
        }

        // Calculating the minimum number of notes
        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        for (int i = 0; i < size; i++) {
            int count = amount / sortedDenominations[i];
            if (count > 0) {
                System.out.println(sortedDenominations[i] + ":" + count);
                amount %= sortedDenominations[i];
            }
        }

        scanner.close();
    }
}
