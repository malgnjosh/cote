import java.util.Scanner;

public class Q2_9 {
    public int solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N];
        int max = 0;
        int sumRow = 0, sumCol = 0, sumDia = 0, k = 0;
        for(int i = 0; i < N; i++) {
            sumRow = sumCol = 0;
            for(int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
                sumRow += board[i][j];
                sumCol += board[j][i];
            }
            if(sumRow > max) max = sumRow;
            if(sumCol > max) max = sumCol;
        }

        int i = 0, j = 0;
        while(i < N && j < N) {
            sumDia += board[i++][j++];
        }
        if(sumDia > max) max = sumDia;

        sumDia = 0;
        int ii = N - 1, jj = 0;
        while(ii >= 0 && jj < N) {
            sumDia += board[ii--][jj++];
        }
        if(sumDia > max) max = sumDia;

        return max;
    }

}
