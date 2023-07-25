package day5;
import java.util.Scanner;
public class exercise1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        int amount = scanner.nextInt();
        System.out.println("Enter the interest rate");
        double interestRate = scanner.nextDouble();
        System.out.println("Enter the time in years");
        double years = scanner.nextDouble();
        double simpleInterest = (amount * interestRate * years) / 10;
        System.out.println("The simple interest rate is " + simpleInterest);
        scanner.close();
    }
}
