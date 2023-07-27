package day6;

public class exercise {
    public static void main (String[] args) {
        String[] arr = {"abc", "xyz", "name", "tree"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "name") {
                System.out.println ("The string is in the array");
            }
            else {System.out.println(arr[i]);}
        }
    }
}
