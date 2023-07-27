package Practice;
import java.util.Scanner;
public class EvenOddChecker {
    static String checkEvenOdd(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                s = arr[i] + " is even number";
            } else {
                s = arr[i] + " is odd number";
            }
        }
        return s;
    }


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number for array");
        int[] array = {2,6,5,9,4,1};
        System.out.println(checkEvenOdd(array));
    }
}
