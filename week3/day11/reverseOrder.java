package day11;

public class reverseOrder {
    static void reverse(int[] arr) {
        for (int i = arr.length; i >= 0; i--) {
            System.out.print(i + " " );
        }
    }
    public static void main(String[] Args) {
        int[] a = {1,2,3,4,5};
        reverse(a);
    }
}
