import java.util.LinkedList;
import java.util.Queue;

public class Q7_9 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, 1);
        root.setLeftChild(new TreeNode(2, 2));
        root.setRightChild(new TreeNode(3, 2));

        root.getLeftChild().setLeftChild(new TreeNode(4, 3));
        root.getLeftChild().setRightChild(new TreeNode(5, 3));

        System.out.println(findLeaf(root));
        //System.out.println(findLeaf2(root));
    }

    public static boolean isLeaf(TreeNode t) {
        return t.getLeftChild() == null && t.getRightChild() == null;
    }

    public static int findLeaf(TreeNode root) { //bfs
        if(isLeaf(root)) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode temp = q.remove();
            if(isLeaf(temp)) return temp.getLevel() - 1;
            if(temp != null) {
                if(temp.getLeftChild() == null || temp.getRightChild() == null) continue;
                q.add(temp.getLeftChild());
                q.add(temp.getRightChild());
            }
        }
        return -1;
    }

    public static int findLeaf2(TreeNode t) { //dfs
        if(isLeaf(t)) return t.getLevel() - 1;
        if(isLeaf(t.getLeftChild())) return t.getLeftChild().getLevel() - 1;
        if(isLeaf(t.getRightChild())) return t.getRightChild().getLevel() - 1;

        if(t.getLeftChild() != null) findLeaf2(t.getLeftChild());
        if(t.getRightChild() != null) findLeaf2(t.getRightChild());

        return -1;
    }
}
