import java.util.*;

public class Q7_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] graph = new int[n + 1][n + 1];
        int[] visited = new int[n + 1];

        // 인접 행렬
        for(int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            graph[a][b] = 1;
        }

        for(int[] gr : graph) {
            for(int g : gr) {
                System.out.print(g + " ");
            }
            System.out.println();
        }

        visited[1] = 1;
        System.out.println(countPath(graph, visited,1, n));

        // 인접 리스트
        ArrayList<Integer>[] adjacencyList = new ArrayList[n + 1];

        for(int i = 1; i <= n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(i);
            for(int j = 1; j <=n; j++) {
                if(graph[i][j] == 1) list.add(j);
            }
            adjacencyList[i] = list;
        }

        for(int i = 1; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp = adjacencyList[i];
            for(int t : temp) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
        Arrays.fill(visited, 0);

        visited[1] = 1;
        System.out.println(countPath2(adjacencyList, visited, 1, n));

    }

    public static int countPath(int[][] g, int[] v, int start, int end) {
        int result = 0;
        if(start == end) return 1;

        // 현재 정점에서 이동할 수 있는 다음 정점 탐색
        for(int i = 1; i <= end; i++) {
            // 간선 존재하고 미방문 정점일 때
            if(g[start][i] == 1 && v[i] != 1) {
                v[i] = 1;
                // 다음 정점부터 시작해서 탐색을 시작
                result += countPath(g, v, i, end);
                // 탐색이 종료되면 초기화를 진행
                v[i] = 0;
            }
        }

        return result;
    }

    public static int countPath2(ArrayList<Integer>[] alist, int[] v, int start, int end) {
        int result = 0;
        if(start == end) return 1;

        ArrayList<Integer> temp = alist[start];
        for(int t : temp) {
            if(t != start && v[t] != 1) {
                v[t] = 1;
                result += countPath2(alist, v, t, end);
                v[t] = 0;
            }
        }

        return result;
    }
}
