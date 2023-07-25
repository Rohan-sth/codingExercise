package day5;
import java.util.Scanner;
public class exercise3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please enter a number between 1 and 7");
        int n = scanner.nextInt();
        String day;
        switch (n) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println(day);
        scanner.close();
    }
}
