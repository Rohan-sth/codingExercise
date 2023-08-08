package day13;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Calculate the fine
        int fine = fine(d1, m1, y1, d2, m2, y2);

        // Output
        System.out.println(fine);

        scanner.close();
    }

    public static int fine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 < y2 || (y1 == y2 && m1 < m2) || (y1 == y2 && m1 == m2 && d1 <= d2)) {
            // Book returned on or before the due date
            return 0;
        } else if (y1 == y2 && m1 == m2) {
            // Book returned in the same calendar month but after the due date
            return 15 * (d1 - d2);
        } else if (y1 == y2 && m1 > m2) {
            // Book returned in the same calendar year but after the due month
            return 500 * (m1 - m2);
        } else {
            // Book returned after the calendar year
            return 1000;
        }
    }
}

