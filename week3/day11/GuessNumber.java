package day11;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min range");
        int min = sc.nextInt();
        System.out.println("Enter max range");
        int max = sc.nextInt();
        Random r = new Random();
        int secretNumber =  r.nextInt(max - min + 1) + min;
        int attempts = 1;
        while (attempts<6){
            System.out.println("Guess a number");
            int g = sc.nextInt();
            if (g == secretNumber){
                System.out.println("You guessed the right number and the number of attempt is " + attempts);
            }
            else if (g < secretNumber) {
                System.out.println("Guess a higher number");

            }
            else {System.out.println("Guess a lower number");}
            attempts+=1;
        }
    }
}
