//URK23CS1127
import java.util.Scanner;

public class MarksRangeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int below40 = 0, between40and60 = 0, between60and80 = 0, above80 = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 40) {
                below40++;
            } else if (marks[i] < 60) {
                between40and60++;
            } else if (marks[i] < 80) {
                between60and80++;
            } else {
                above80++;
            }
        }

        System.out.println("Below 40: " + below40);
        System.out.println("40 to 59: " + between40and60);
        System.out.println("60 to 79: " + between60and80);
        System.out.println("80 and above: " + above80);
    }
}
