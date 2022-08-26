import java.util.Scanner;

public class Q2_10 {
    public int solve() {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int N = sc.nextInt();
        int[][] board = new int[N + 2][N + 2];

        for (int i = 0; i < N + 2; i++) {
            for (int j = 0; j < N + 2; j++) {
                if(i == 0 || i == N + 1 || j == 0 || j == N + 1) board[i][j] = 0;
                else board[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(isPeak(i, j, board)) result++;
            }
        }
        return result;
    }

    public boolean isPeak(int i, int j, int[][] board){
        boolean ret = true;
        if(board[i - 1][j] >= board[i][j]) ret = false;
        if(board[i + 1][j] >= board[i][j]) ret = false;
        if(board[i][j - 1] >= board[i][j]) ret = false;
        if(board[i][j + 1] >= board[i][j]) ret = false;
        return ret;
    }

}
