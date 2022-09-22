import java.util.*;

public class Q5_5 {

    public void solve() {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stk = new Stack<>();
        String str = sc.next();
        int result = 0;

        //레이저
        for(char c : str.toCharArray()) {
            if(c == ')' && stk.peek() == '(') {
                stk.pop();
                stk.push('O');
            }
            else stk.push(c);
        }

        //자르기
        int len = stk.size(), step = 0, pieces = 0;
        char temp = '\0';

        for(int i = 0; i < len; i++) {
            temp = stk.pop();
            if(temp == ')') step++;
            else if(temp == 'O') {
                pieces += step;
            }
            else if(temp == '(') {
                result += pieces + 1;
                step--;
                pieces = 0;
            }
        }
        System.out.println(result);
    }

}
