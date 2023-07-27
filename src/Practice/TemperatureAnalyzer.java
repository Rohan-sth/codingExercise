package Practice;

public class TemperatureAnalyzer {
    static int findMaxTemperature(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] < arr[i]) {
                max = arr[i];
            }
        }
            return max;
        }
        static int findMinTemperature ( int[] array){
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[0] > array[i]) {
                    min = array[i];
                }
            }
            return min;
        }
        static int findAverageTemperature ( int[] arr){

            int sum = 0;
            int a = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            a = sum / arr.length;
            return a;
        }

    public static void main(String[] args) {
        int[] temp = {98, 87, 66, 54, 33};
        int x = findMaxTemperature(temp);
        int y = findMinTemperature(temp);
        int z = findAverageTemperature(temp);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
