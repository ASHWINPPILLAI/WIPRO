//URK23CS1127
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c);
    }
}
