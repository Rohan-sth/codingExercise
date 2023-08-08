package day8;
import java.util.Scanner;
public class FindWord {
    public static String getNthWord(String s, int n) {
        String[] str = s.split(" ");
        if ((n - 1) < str.length) {
            return str[n - 1];
        }
        else {
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String x = scanner.nextLine();
        System.out.println("Enter a number to return the nth word of the string");
        int a = scanner.nextInt();
        System.out.println(getNthWord(x, a));
    }
}