import java.util.Scanner;

public class Q1_9 {
    public int solve() {
        Scanner in = new Scanner(System.in);
        int digit = 1, result = 0;
        String s = in.nextLine();
        for(int i = s.length() - 1; i >= 0; i--) {
            char next = s.charAt(i);
            if (48 <= next && next <= 57 ) {
                if(next != '0') result += digit * Integer.parseInt(Character.toString(next));
                digit *= 10;
            }
        }
        return result;

    }

}
