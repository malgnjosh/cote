import java.util.HashMap;
import java.util.Scanner;

public class Q4_4 {
    public int solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int len = T.length();
        int cnt = 0;

        for(int i = 0; i <= S.length() - len; i++) {
            String s = S.substring(i, i + len);
            if(isAnagram(s, T)) cnt ++;
        }

        return cnt;
    }
    public boolean isAnagram(String s1, String s2) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++) {
            char next1 = s1.charAt(i);
            char next2 = s2.charAt(i);
            int cnt1 = 0, cnt2 = 0;

            if(hm1.get(next1) != null) cnt1 = hm1.get(next1);
            if(hm2.get(next2) != null) cnt2 = hm2.get(next2);
            hm1.put(next1, cnt1 + 1);
            hm2.put(next2, cnt2 + 1);
        }

        Result r = new Result();
        hm1.forEach((key, value)->{
            if(value != hm2.get(key)) r.result_b = false;
        });

        return r.result_b;
    }
}