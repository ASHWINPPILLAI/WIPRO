//URK23CS1127
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        StringBuilder binary = new StringBuilder();
        if (n == 0) {
            binary.append('0');
        }
        int num = n;
        while (num > 0) {
            binary.insert(0, num % 2);
            num = num / 2;
        }

        System.out.println("Binary equivalent of " + n + " = " + binary);
    }
}
