package day5;
import java.util.Scanner;
public class exercise2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scanner.nextInt();
        if (score >89 && score <= 100) {
            System.out.println ("Your grade is A");
        }
        else if (score >79 && score <= 89) {
            System.out.println ("Your grade is B");
        }
        else if (score >69 && score <= 79) {
            System.out.println ("Your grade is C");
        }
        else if (score >59 && score <= 69) {
            System.out.println ("Your grade is D");
        }
        else { System.out.println("Your grade is F");}
        scanner.close();
    }
}
