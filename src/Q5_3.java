import java.util.Scanner;
import java.util.Stack;

public class Q5_3 {
    public void solve() {
        Scanner sc = new Scanner(System.in);

        //입력
        int N = sc.nextInt();
        int[][] board = new int[N + 1][N + 1];
        Stack[] stk = new Stack[N + 1];

        for(int i = 1; i < N + 1; i++) {
            for(int j = 1; j < N + 1; j++) {
                board[i][j] = sc.nextInt(); //인형뽑기
            }
        }

        int M = sc.nextInt();
        int[] moves = new int[M]; //이동순서
        for(int i = 0; i < M; i++) {
            moves[i] = sc.nextInt();
        }

        //인형뽑기 상태를 스택에 저장
        int count = 0;
        for(int j = 1; j <= N; j++) {
            stk[j] = new Stack<Integer>();
            for(int i = N; i > 0; i--) {
                if(board[i][j] != 0) stk[j].push(board[i][j]);
            }
        }


        stk[0] = new Stack<Integer>(); //뽑힌 인형
        for(int i = 0; i < M; i++) {
            int next = moves[i], picked = 0, stacked = -1;
            if(stk[next].isEmpty()) continue;
            else picked = (int)stk[next].pop();

            if(!stk[0].isEmpty()) stacked = (int)stk[0].peek();

            //같은 인형을 제거
            if(picked == stacked) {
                count += 2;
                stk[0].pop();
            }
            //다르면 스택에 저장
            else stk[0].push(picked);
        }
        System.out.println(count);
    }
}
