package Practice;
import java.util.Scanner;
public class Palindrome {
    public static void check(String s) {
        String str = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            str = ch + str;
        }
        if (s.equals(str)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string" );
        String s = scanner.nextLine();
        check(s);
    }
}
