package day15;

public class SessionOutput {
    public static int session(int problemsSolved, int queries) {
        if (problemsSolved >= 5 && queries >= 5) {
            if (problemsSolved >= 2 * queries || queries >= 2 * problemsSolved) {
                return 2;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(session(6, 8));
        System.out.println(session(3, 8));
        System.out.println(session(20, 6));
    }
}
