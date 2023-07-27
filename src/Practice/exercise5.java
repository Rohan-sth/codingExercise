package Practice;
import java.util.Scanner;
public class exercise5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Please enter five integer for the array");
        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Please enter a target integer");
        int x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("The target integer is in position " + i);
            }
            else {System.out.println("The target is not in the array");}
        }
    }
}
