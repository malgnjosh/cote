import java.util.Scanner;

public class Q3_6 {
    public int solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 0;
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            int next = sc.nextInt();
            arr[i] = next;
        }

        for(int i = 0; i < N; i++) {
            int len = 0, k = K;

            for(int j = i; j < N; j++) {
                if(arr[j] == 1) len++;
                else {
                    k--;
                    if (k < 0) break;
                    len++;
                }
            }
            if(len > result) result = len;

        }

        return result;

    }
}
