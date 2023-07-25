package day3;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c;
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter your operation");
        String s;
        s = scanner.next();

        if (s.equals("add")){
            c = a + b;
        }
        else if (s.equals("subtract")){
            c = a - b;
        }
        else if (s.equals("multiply")){
            c = a * b;
        }
        else {c = a / b;}
        System.out.println(c);
    }
}

