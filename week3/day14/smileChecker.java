package day14;
import java.util.Scanner;
public class smileChecker {
    static boolean monkeyTrouble(boolean a, boolean b) {
        if (a == true && b == true) {
            return true;
        }
        if (a == false && b == false) {
            return true;
        }
        else {return false;}
    }

    public static void main (String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("is monkey a smiling?");
        boolean aSmile = sc.nextBoolean();
        System.out.println("is monkey b smiling?");
        boolean bSmile = sc.nextBoolean();
        System.out.println("are you in trouble?, the answer is: " + monkeyTrouble(aSmile,bSmile));
}
}