package day15;

public class ArrayChecker {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 1};
        int[] arr3 = {1, 2, 1};

        boolean result1 = sameFirstLast(arr1);
        boolean result2 = sameFirstLast(arr2);
        boolean result3 = sameFirstLast(arr3);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }

    public static boolean sameFirstLast(int[] arr) {
        return arr.length >= 1 && arr[0] == arr[arr.length - 1];
    }
}







