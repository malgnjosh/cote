import java.util.Scanner;
import java.util.Stack;

class Q5_1 {
    public String solve() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            if('(' == str.charAt(i)) stk.push('(');
            else {
                if(stk.isEmpty()) return "NO";
                else if('(' != stk.pop()) return "NO";
            }
        }
        if(stk.isEmpty()) return "YES";
        else return "NO";
    }
}
