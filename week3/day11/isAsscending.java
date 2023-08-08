package day11;

public class isAsscending {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 9, 2 };

        if (isAscending(array)) {
            System.out.println("The array is in ascending order.");
        } else {
            System.out.println("The array is NOT in ascending order.");
        }
    }

    public static boolean isAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

