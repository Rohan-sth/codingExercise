package day14;
import java.util.Scanner;
public class Duplicate {
    static int doubleChecker(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    arr1[i] = arr[i];
                    }
            }
        }
            return arr1[arr.length];
        }

        public static void main(String[] Args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number for the length of your array");
            int a = sc.nextInt();
            int[] b = new int[a];
            for (int i = 0; i < b.length; i++){
                System.out.println("Enter the number for your array");
                b[i] = sc.nextInt();
            }
            System.out.println("THe duplicate numbers is/are " + doubleChecker(b));
        }
    }

