import java.util.*;

public class Q5_8 {
    public void solve() {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        int next = 0, count = 0;
        int[] risk = new int[N];
        ArrayList<Integer> complete = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            risk[i] = sc.nextInt();
            queue.add(i);
        }

        while(!queue.isEmpty()) { // 큐가 비워질 때까지
            next = queue.remove();
            int flag = 0;

            for(int i = 0; i < N; i++) {
                if(i != next && !complete.contains(i) && risk[next] < risk[i]) {
                    flag = 1; // 위중환자 존재
                    break;
                }
            }

            if(flag == 1) queue.add(next); // 후순위로 밀려남
            else { // 치료!
                complete.add(next);
                count++;
                if(next == M) break;
            }
        }
        System.out.println(count);
    }
}
