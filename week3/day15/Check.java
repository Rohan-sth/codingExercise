package day15;

public class Check {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;

        boolean result = makes10(a, b);
        System.out.println("Result: " + result);
    }

    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || (a + b == 10);
    }
}

