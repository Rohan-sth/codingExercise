package day15;

public class FizzBuzz {
    public static String fizzString(String str) {
        boolean startsWithF = str.startsWith("f");
        boolean endsWithB = str.endsWith("b");

        if (startsWithF && endsWithB) {
            return "FizzBuzz";
        } else if (startsWithF) {
            return "Fizz";
        } else if (endsWithB) {
            return "Buzz";
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }
}
