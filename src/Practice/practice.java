package Practice;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line");
        String x = scanner.nextLine();
        x = x.toLowerCase();
        for (int i = 0; i < x.length(); i++) {
           if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u') {
               sum += 1;
           }
        }
        System.out.println("The number of vowels are " + sum);
    }
}