import java.util.*;

public class Q2_8 {
    public int[] solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int score[] = new int[N];
        int result[] = new int[N];

        for(int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            int count = 1;
            for(int j = 0; j < N; j++) {
                if(score[i] < score[j]) count++;
            }
            result[i] = count;
        }

        return(result);
    }
}
