import java.util.Scanner;

public class Q1_10 {
    public void solve() {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        int[] result = new int[input1.length()];

        for(int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        for(int i = 0; i < input1.length(); i++) {
            char next = input1.charAt(i);
            if(next == input2.charAt(0)) result[i] = 0;
            else {

            }
        }

    }
}
