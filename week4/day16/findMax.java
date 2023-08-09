package day16;
import java.util.ArrayList;
import java.util.Collections;
public class findMax {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(22);
        numbers.add(67);
        numbers.add(89);
        numbers.add(12);

        int max = findMaxElement(numbers);
        System.out.println("Maximum element in the ArrayList: " + max);
    }

    public static int findMaxElement(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}