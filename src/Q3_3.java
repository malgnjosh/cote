import java.util.*;
public class Q3_3 {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int K = in.nextInt();

    public int solve() {
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int max = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            for(int j = 0; j < K; j++) {
                if(i + j >= arr.length) break;
                sum += arr[i + j];
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

}
