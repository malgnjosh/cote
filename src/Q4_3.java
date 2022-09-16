import java.util.*;

public class Q4_3 {
    public int[] solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        int[] arr = new int[N];
        int len = N - K + 1;
        int[] result = new int[len];

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < K; i++) {
            hs.add(arr[i]);
        }

        hs.clear();

        return result;
    }
}
