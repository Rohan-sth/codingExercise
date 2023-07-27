package Practice;
import java.util.Scanner;
public class Swap {
    public static void swapping(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Value of x is " + x + " and value of y is " + y);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        System.out.println("Enter second number");
        int y = scanner.nextInt();
        System.out.println("The number before swap is " + x + " " + y);
        swapping(x, y);
           }
}
