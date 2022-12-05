import java.util.*;

public class Q8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();

        int cnt = 0, remainder = M, quotient = 0;
        for(int i = N - 1; i >= 0; i--) {
            quotient = remainder / arr[i];
            if(quotient > 0) {
                cnt += quotient;
                remainder = remainder % arr[i];
                if(remainder == 0) break;
            }

            System.out.print("cnt " + cnt + "remainder " + remainder + " | ");
        }
        if(remainder > 0) { // 나누어떨어지지 않을때
            //perm(arr, N, M);
        }

        System.out.println(cnt);

    }

    public static void perm(int[] arr, int n, int m) {

    }
}
