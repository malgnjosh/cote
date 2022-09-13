import java.util.*;

public class Q4_2 {

    public String solve() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        if(s1.length() != s2.length()) return "NO";
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
            if(value != hm2.get(key)) r.result = "NO";
        });

        return r.result;
    }
}

