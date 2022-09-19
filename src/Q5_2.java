import java.util.Scanner;
import java.util.Stack;

public class Q5_2 {

    public void solve() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stk = new Stack<>();
        Stack<Character> resultStk = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            if(')' != str.charAt(i)) stk.push(str.charAt(i));
            else {
                while('(' != stk.pop());
            }
        }
        while(!stk.isEmpty()) {
            resultStk.push(stk.pop());
        }
        while(!resultStk.isEmpty()) {
            System.out.print(resultStk.pop());
        }
    }
}
