import java.util.Scanner;

public class Q2_7 {
    public int solve() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] score = new int[N];
        int totalScore = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            score[i] = in.nextInt();
        }
        for(int i = 0; i < score.length; i++) {
            totalScore += score[i];

            //가산점 부여
            do {
                if(score[i] == 1 && (i + 1) < score.length && score[i + 1] == 1) {
                    sum++;
                    totalScore += sum;
                    i++;
                }
                else {
                    totalScore += sum;
                    sum = 0;
                    break;
                }
            } while(i < score.length);
        }
        return totalScore;
    }
}
