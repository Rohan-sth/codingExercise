package day5;
import java.util.Scanner;
public class exercise4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your base number");
        int base = scanner.nextInt();
        System.out.println("Enter your exponent");
        int exponent = scanner.nextInt();
        int n = base;
        int t = 0;
        for (int i = 1; i < exponent; i++) {
            t = n * base;
            n = t;
        }
        System.out.println("The output is " + t);
        scanner.close();
    }
}
