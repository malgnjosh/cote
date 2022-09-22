import java.util.Scanner;
import java.util.Stack;

public class Q5_4 {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Integer> stk = new Stack<>();
        char op = '\0';

        for(int i = 0; i < str.length(); i++) { // for( x : str.toCharArray)
            char next = str.charAt(i);
            if(next >= 48 && next <= 57) stk.push(next - '0'); // if(Character.isDigit()) Character.getNumericValue()
            else {
                op = next;
                int op1 = stk.pop();
                int op2 = stk.pop();
                int result = calc(op1, op2, op);
                stk.push(result);
            }
        }

        System.out.println(stk.pop());
    }

    public int calc(int op1, int op2, char op) {
        if(op == '+') return op1 + op2;
        else if(op == '-') return Math.abs(op2 - op1);
        else if(op == '*') return op2 * op1;
        else if(op == '/') return op2 / op1;
        else return -1;
    }
}
