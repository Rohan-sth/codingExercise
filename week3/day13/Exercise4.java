package day13;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        boolean isMultiple = checkMultiple(num1, num2);

        if (isMultiple) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }

        scanner.close();
    }

    public static boolean checkMultiple(int num1, int num2) {
        return num1 % num2 == 0;
    }
}
