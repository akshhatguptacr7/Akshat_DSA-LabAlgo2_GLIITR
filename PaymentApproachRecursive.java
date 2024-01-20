import java.util.Arrays;
import java.util.Scanner;

public class PaymentApproachRecursive {
    public static void printMinNotes(int[] denominations, int amount, int index) {
        if (amount == 0 || index == denominations.length) {
            return;
        }

        int count = amount / denominations[index];
        if (count > 0) {
            System.out.println(denominations[index] + ":" + count);
            amount %= denominations[index];
        }

        printMinNotes(denominations, amount, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
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

        // Calculating the minimum number of notes using recursion
        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        printMinNotes(sortedDenominations, amount, 0);

        scanner.close();
    }
}
