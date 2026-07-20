//URK23CS1127
import java.util.Scanner;

public class EvenOddZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("The number is Zero");
        } else if (n % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}
