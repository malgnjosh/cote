import java.util.*;

public class Q8_3 {
    private static int ret = 0;

    // 최대점수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt(); // 문제수, 제한시간
        int[][] prob = new int[N][2];

        for(int i = 0; i < N; i++) { // 점수, 시간
            prob[i][0] = sc.nextInt();
            prob[i][1] = sc.nextInt();
        }

        solve(prob,0,0,0, M);
        System.out.println(ret);

    }

    public static void solve(int[][] prob, int sSum, int tSum, int no, int limit) {
        // 남은 문제가 없음.
        if(no == prob.length) return;

        // 안 푼다
        solve(prob, sSum, tSum, no + 1, limit);

        // 푼다
        tSum += prob[no][1];
        if(tSum > limit) { // 제한 시간 초과
            tSum -= prob[no][1];
            solve(prob, sSum, tSum, no + 1, limit);
        }
        else {
            sSum += prob[no][0];
            if(sSum > ret) ret = sSum;
            solve(prob, sSum, tSum,no + 1, limit);
        }

    }


}
