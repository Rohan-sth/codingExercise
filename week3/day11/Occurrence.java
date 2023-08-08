package day11;
import java.util.Scanner;
import java.io.*;
public class Occurrence {
    public static void main(String[] Args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s= sc.nextLine();
        System.out.println("Enter a character");
        char c = sc.nextLine().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                a++;
            }
        }
        System.out.println("The number of occurrence of your character is " + a);
    }
}
