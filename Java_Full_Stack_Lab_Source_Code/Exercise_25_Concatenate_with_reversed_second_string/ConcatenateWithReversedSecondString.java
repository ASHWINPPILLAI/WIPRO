//URK23CS1127
import java.util.Scanner;

public class ConcatenateWithReversedSecondString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String reversedStr2 = new StringBuilder(str2).reverse().toString();
        String result = str1 + reversedStr2;

        System.out.println("Concatenated string with reversed second string = " + result);
    }
}
