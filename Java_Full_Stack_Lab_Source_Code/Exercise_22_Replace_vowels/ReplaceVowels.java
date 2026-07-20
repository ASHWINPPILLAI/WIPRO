//URK23CS1127
import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                result.append('*');
            } else {
                result.append(ch);
            }
        }

        System.out.println("String after replacing vowels = " + result);
    }
}
