import java.util.*;

public class Q4_5 {
    public int solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        int[] arr = new int[N];
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(j == i) continue;
                for(int k = 0; k < N; k++) {
                    if(k == i || k == j) continue;
                    ts.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        int next = ts.last();
        if(K == 1) return next;
        if(K > ts.size()) return -1;
        else {
            for(int i = 2; i < K + 1; i++) {
                next = ts.lower(next);
            }
        }

        return next;
    }
}
