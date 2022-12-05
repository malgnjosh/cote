import java.util.*;

public class A8_11 {
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};
    static int[][] board, dis;
    public void BFS(int x, int y) {
        Queue<Coordinate> q = new LinkedList<>();
        q.offer(new Coordinate(1, 1));
        board[x][y] = 1;
        while(!q.isEmpty()) {
            Coordinate tmp = q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = tmp.getX() + dx[i];
                int ny = tmp.getY() + dy[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    q.offer(new Coordinate(nx, ny));
                    dis[nx][ny] = dis[tmp.getX()][tmp.getY()] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        A8_11 T = new A8_11();
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];

        //pos = new Coordinate(1, 1);

        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        T.BFS(1, 1);
        if(dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);

    }
}
