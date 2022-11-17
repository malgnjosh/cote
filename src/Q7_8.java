import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q7_8 {
    static Queue<TreeNode> q = new LinkedList<>();
    static int[] move = {1, -1, 5};
    static int[] visited = new int[10001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(), s = sc.nextInt();
        TreeNode root = new TreeNode(h, 0);
        visited[h] = 1;

        solveWithBfs(root, s);

        solve(h, s);
    }

    public static void solve(int h, int s) {
        int quotient1 = 0, remainder1 = 0, quotient2 = 0, remainder2 = 0;

        int diff = s - h;
        if(diff < 0) System.out.println(h - s);
        else if(diff == 0) System.out.println(0);
        else {
            quotient1 = diff / 5;
            remainder1 = diff % 5;

            quotient2 = quotient1 + 1;
            remainder2 = 5 * quotient2 - diff;

            System.out.println(Math.min(quotient1 + remainder1, quotient2 + remainder2));
        }
    }

    public static void solveWithBfs(TreeNode t, int s) {
        int data = t.getData(), level = t.getLevel();
        if(data <= 0) {
            solveWithBfs(q.poll(), s);
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
        solveWithBfs(q.poll(), s);

    }
}
