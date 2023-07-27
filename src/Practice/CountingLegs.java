package Practice;
import java.util.Scanner;
public class CountingLegs {
    public static int count(int a, int b, int c) {
        int sum = ((a * 2) + (b * 4) + (c * 4));
        return sum;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter the number of chickens");
        int x = scanner.nextInt();
        System.out.println ("Enter the number of cows");
        int y = scanner.nextInt();
        System.out.println ("Enter the number of pigs");
        int z = scanner.nextInt();
        System.out.println("the total number of legs are " + count(x, y, z));
    }
}
