package day13;

public class Exercise2 {
    public static void main(String[] args) {
        int[] array = {-2, 0, 3, 4, 1, 9};
        int result = findSmallestPositiveInt(array);
        System.out.println("The smallest positive integer in the array is: " + result);
    }

    public static int findSmallestPositiveInt(int[] array) {
        int smallestPositiveInt = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] <= smallestPositiveInt) {
                smallestPositiveInt = array[i];
            }
        }

        return smallestPositiveInt;
    }
}

