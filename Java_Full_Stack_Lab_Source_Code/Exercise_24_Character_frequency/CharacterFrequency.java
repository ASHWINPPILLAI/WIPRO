//URK23CS1127
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;
            for (char c : str.toLowerCase().toCharArray()) {
                if (c == ch) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("'" + ch + "' occurs " + count + " time(s)");
            }
        }
    }
}
