import java.util.Scanner;

public class Q3_4 {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            int sum = 0;
            int j = i;
            while(sum < M && j < N) {
                sum += arr[j++];
            }
            if(sum == M) count++;
        }
        System.out.println(count);
    }
}
