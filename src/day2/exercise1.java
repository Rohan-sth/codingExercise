package day2;
import java.util.Scanner;
public class exercise1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature of your city in Celsius");
        double celsius = scanner.nextDouble();
        double f = (celsius * 9 / 5) + 32;
        System.out.println("The converted temperature in farenheit is " + f);
    }
}
