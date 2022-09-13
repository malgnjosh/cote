import java.util.*;

public class Q4_1 {

    public char solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for(char i = 'A'; i < 'F'; i++) {
            hm.put(i, 0);
        }

        for(int i = 0; i < s.length(); i++) {
            char next = s.charAt(i);
            hm.put(next, hm.get(next) + 1);
        }

        int max = 0;
        char result = ' ';
        for(char i = 'A'; i < 'F'; i++) {
            if(max < hm.get(i)) {
                max = hm.get(i);
                result = i;
            }
        }
        return result;
    }

}
