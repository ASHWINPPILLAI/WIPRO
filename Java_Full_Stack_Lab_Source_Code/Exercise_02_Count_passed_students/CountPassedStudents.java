//URK23CS1127
import java.util.Scanner;

public class CountPassedStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int passCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            int marks = sc.nextInt();
            if (marks >= 40) {
                passCount++;
            }
        }

        System.out.println("Number of students passed: " + passCount);
    }
}
