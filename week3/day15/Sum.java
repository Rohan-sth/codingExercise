package day15;

public class Sum {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int result = sumDouble(a, b);
        System.out.println("Result: " + result);
    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }
}






