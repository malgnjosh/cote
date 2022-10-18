import java.util.LinkedList;
import java.util.Queue;

public class Q7_6 extends Solution{
    public void solve() {
        int N = sc.nextInt();

//        int V = 1; // 시작 정점
//        int[] visited = new int[N + 1];
//        int[][] graph = new int[N + 1][N + 1];
//
//        for(int i = 1; i < N + 1; i++) {
//            for(int j = 1; j < N + 1; j++) {
//                if(i == j) graph[i][j] = 0;
//                else graph[i][j] = 1;
//            }
//        }
//
//        for(int i = 1; i < N + 1; i++) {
//            for(int j = 1; j < N + 1; j++) {
//                System.out.print(graph[i][j]);
//            }
//            System.out.println();
//        }
//
//
//        Queue<Integer> q = new LinkedList<Integer>();
//        q.add(V);
//        while(!q.isEmpty()) bfs(q, graph, visited);

    }
    public void subSet(int n, int N) {
        if(n == 1) {
            System.out.println(N);
            return;
        }

        subSet(n - 1, N);
    }

}
