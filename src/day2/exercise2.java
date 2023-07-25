package day2;
import java.util.Scanner;

public class exercise2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your currency in USD");
        double u = scanner.nextDouble();
        final double exchangeRate = 82.05;
        double convertedAmount = u * exchangeRate;
        System.out.println("The converted amount is " + convertedAmount);
    }
}

