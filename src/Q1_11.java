import java.util.Scanner;

public class Q1_11 {
    public String solve() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++) {
            if(count==1) sb.append(prev);
            if(prev == s.charAt(i)) count++;
            else if(count > 1){
                sb.append(count);
                count = 1;
            }
            prev = s.charAt(i);
        }
        if(count > 1) sb.append(count);
        else sb.append(prev);
        return sb.toString();
    }

}
