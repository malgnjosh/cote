import java.util.*;

public class Q1_8 {
    public String solve() {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine().toLowerCase();

        int i = 0, j = s.length() - 1;
        while(i < j) {
            char first = s.charAt(i);
            char last = s.charAt(j);
            if(97 > first || first > 122) {
                i++;
                continue;
            }
            if(97 > last || last > 122) {
                j--;
                continue;
            }
            if(first != last) return "NO";
            else {
                i++;
                j--;
            }
        }
        return "YES";
    }
}
