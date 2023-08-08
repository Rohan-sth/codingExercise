package day15;

public class Array667 {
    public static void main(String[] args) {
        int[] arr1 = {6, 6, 2};
        int[] arr2 = {6, 6, 2, 6};
        int[] arr3 = {6, 7, 2, 6};

        int count1 = array667(arr1);
        int count2 = array667(arr2);
        int count3 = array667(arr3);

        System.out.println("Count 1: " + count1);
        System.out.println("Count 2: " + count2);
        System.out.println("Count 3: " + count3);
    }

    public static int array667(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 6 && (arr[i + 1] == 6 || arr[i + 1] == 7)) {
                count++;
            }
        }

        return count;
    }
}

