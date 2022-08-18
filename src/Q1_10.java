import java.util.Scanner;

public class Q1_10 {
    public int[] solve() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String c = in.next();
        int[] result = new int[s.length()];

        for(int i = 0; i < s.length(); i++) {
            result[i] = 100;
        }

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c.charAt(0)) {
                result[i] = 0;
                for(int j = 0; j < s.length(); j++) {
                    if(result[j] > Math.abs(i - j)) result[j] = Math.abs(i - j);
                }
            }
        }
        return result;
    }
}
