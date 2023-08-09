package day16;
import java.util.ArrayList;
public class Merge {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);

        ArrayList<Integer> mergedList = mergeArrayLists(list1, list2);

        System.out.println("Merged ArrayList: " + mergedList);
    }

    public static ArrayList<Integer> mergeArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
    }
}
