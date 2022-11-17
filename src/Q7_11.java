import java.util.*;

public class Q7_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[][] graph = new int[n + 1][n + 1];
        int[] visited = new int[n + 1];

        for(int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            graph[a][b] = 1;
        }

        for(int i = 2; i <= n; i++) {
            System.out.print(i + ": " + shortestPath(graph, i));
        }


    }

    public static int shortestPath(int[][] graph, int target) {
        return 0;
    }
}
