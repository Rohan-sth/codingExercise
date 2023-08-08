package day13;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers separated by commas:");
        String input = scanner.nextLine();

        int maxNumber = findMaxNumber(input);
        System.out.println("The maximum number is: " + maxNumber);

        scanner.close();
    }

    public static int findMaxNumber(String input) {
        String[] numbers = input.split(",");
        int maxNumber = Integer.MIN_VALUE;

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr.trim());
            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        return maxNumber;
    }
}

