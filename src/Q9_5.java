import java.util.*;
public class Q9_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(), e = sc.nextInt();
        int[][] matrix = new int[v + 1][v + 1];
        int[] distance = new int[v + 1];
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < e; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), c = sc.nextInt();
            matrix[x][y] = c;
        }

//        boolean isFirst = true;
//        for(int[] ma : matrix) {
//            if(isFirst) {
//                isFirst = false;
//            }
//            else {
//                for (int m : ma) {
//                    System.out.print(m + " ");
//                }
//                System.out.println();
//            }
//        }
        // int타입 최대값 삽입 2,147,483,647
        for(int i = 1; i < v + 1; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        q.offer(1);
        while(!q.isEmpty()) {
            int next = q.poll();
            for(int i = 1; i < v + 1; i++) {
                if(matrix[next][i] > 0) {
                    if(distance[i] > matrix[next][i]) distance[i] = matrix[next][i];
                    q.offer(i);
                }
            }
            for(int d : distance) {
                System.out.print(d + " ");
            }

        }
    }
}
