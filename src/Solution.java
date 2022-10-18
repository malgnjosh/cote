import java.util.*;
class Solution {
    Scanner sc = new Scanner(System.in);

    public void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public void swap(Object[] arr, int idx1, int idx2) {
        Object temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public void dfs(int[][] g, int[] v, int e) {
        if(v[e] != 1) {
            v[e] = 1;
            System.out.print(e + "방문 ");
            for(int i = 1; i < g.length; i++) {
                if(g[e][i] == 1 && v[i] == 0) dfs(g, v, i);
            }
        }
    }

    public static void bfs(Queue<Integer> q, int[][]g, int[]v) {

        if(q.isEmpty()) return;
        int e = q.poll(); // 큐에서 새로운 정점을 하나 가져옴

        if(v[e] != 1) {
            v[e] = 1;
            System.out.print((e)+" ");
            for(int i = 1; i < g.length; i++) { // 인접한 정점을 큐에 저장
                if(g[e][i] == 1) q.add(i);
            }
        }

        else return;

    }
}
