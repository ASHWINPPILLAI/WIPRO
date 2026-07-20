//URK23CS1127
import java.util.Scanner;

public class CountNegativeNonNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int negative = 0, nonNegative = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int num = sc.nextInt();
            if (num < 0) {
                negative++;
            } else {
                nonNegative++;
            }
        }

        System.out.println("Negative numbers: " + negative);
        System.out.println("Non-negative numbers: " + nonNegative);
    }
}
