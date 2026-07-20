//URK23CS1127
import java.util.Scanner;

public class MaximumValuePositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print("Maximum value " + max + " found at position(s): ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
