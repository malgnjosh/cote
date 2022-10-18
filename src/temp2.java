import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class temp2 {

    static Queue<TreeNode> q = new LinkedList<>();
    static int[] move = {1, -1, 5};
    static int[] visited = new int[10001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(), s = sc.nextInt();
        TreeNode root = new TreeNode(h, 0);
        visited[h] = 1;
        bfs(root, s);
    }

    public static void bfs(TreeNode t, int s) {
        int data = t.getData(), level = t.getLevel();
        if(data <= 0) {
            bfs(q.poll(), s);
            return;
        }
        for(int i = 0; i < 3; i++) {
            int newData = data + move[i];
            if(newData == s) {
                System.out.println(level + 1);
                return;
            }
            if(visited[newData] != 1) {
                visited[newData] = 1;
                q.add(new TreeNode(newData, level + 1));
            }
        }
        bfs(q.poll(), s);

    }

}
