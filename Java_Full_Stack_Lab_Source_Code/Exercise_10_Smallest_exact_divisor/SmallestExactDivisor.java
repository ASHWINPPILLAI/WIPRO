//URK23CS1127
import java.util.Scanner;

public class SmallestExactDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int divisor = -1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                divisor = i;
                break;
            }
        }

        if (divisor == -1) {
            System.out.println(n + " has no divisor other than itself (it is prime or 1)");
        } else {
            System.out.println("Smallest exact divisor of " + n + " (other than 1) is: " + divisor);
        }
    }
}
