package day5;
import java.util.Scanner;
public class exercise5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in Kg");
        int w = scanner.nextInt();
        System.out.println("Enter your height in meters");
        double h = scanner.nextDouble();
        double bmi = w / (h * h);
        System.out.println("Your BMI is " + bmi);
        scanner.close();
    }
}
