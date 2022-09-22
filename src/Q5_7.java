import java.util.*;

public class Q5_7 {

    public void solve() {
        Queue<Character> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        String compulsory = sc.next();
        String plan = sc.next();


        for(int i = 0; i < compulsory.length(); i++) {
            queue.add(compulsory.charAt(i));
        }

        char next = queue.remove();
        for(int i = 0; i < plan.length(); i++) {
            if(plan.charAt(i) == next) {
                if(queue.peek() != null) next = queue.remove();
                else next = '\0';
            }
            if(queue.isEmpty() && next=='\0') break;
        }

        if(queue.isEmpty() && next=='\0') System.out.println("YES");
        else System.out.println("NO");
    }
}
