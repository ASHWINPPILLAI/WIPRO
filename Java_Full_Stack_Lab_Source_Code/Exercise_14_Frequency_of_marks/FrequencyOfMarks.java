//URK23CS1127
import java.util.Scanner;

public class FrequencyOfMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        boolean[] counted = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (marks[i] == marks[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println("Marks " + marks[i] + " occurs " + count + " time(s)");
            }
        }
    }
}
