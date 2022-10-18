import java.util.LinkedList;
import java.util.Queue;

public class Q7_5 {

    public void solve() {
        // 트리 제작
        TreeNode root = new TreeNode(1);
        root.setLeftChild(new TreeNode(2));
        root.setRightChild(new TreeNode(3));

        root.getLeftChild().setLeftChild(new TreeNode(4));
        root.getLeftChild().setRightChild(new TreeNode(5));

        root.getRightChild().setLeftChild(new TreeNode(6));
        root.getRightChild().setRightChild(new TreeNode(7));

        // 전위순회
        VLR(root);
        System.out.println();
        // 중위순회
        LVR(root);
        System.out.println();
        // 후위순회
        LRV(root);
        System.out.println();
        // 레벨순회

        //levelTravel(root);
        //System.out.println();

        levelTravel2(root);

    }

    public void VLR(TreeNode root) {
        System.out.print(root.getData() + " ");
        if(root.getLeftChild() != null) VLR(root.getLeftChild());
        if(root.getRightChild() != null) VLR(root.getRightChild());
    }

    public void LVR(TreeNode root) {
        if(root.getLeftChild() != null) LVR(root.getLeftChild());
        System.out.print(root.getData() + " ");
        if(root.getRightChild() != null) LVR(root.getRightChild());
    }

    public void LRV(TreeNode root) {
        if(root.getLeftChild() != null) LRV(root.getLeftChild());
        if(root.getRightChild() != null) LRV(root.getRightChild());
        System.out.print(root.getData() + " ");
    }

    public void levelTravel(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        System.out.print(root.getData() + " ");
        q.add(root.getLeftChild());
        q.add(root.getRightChild());
        TreeNode temp = q.remove();
        if(temp != null) levelTravel(temp);
    }
    public void levelTravel2(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode temp = q.remove();
            if (temp != null) {
                System.out.print(temp.getData() + " ");
                if(temp.getLeftChild() == null || temp.getRightChild() == null) continue;
                q.add(temp.getLeftChild());
                q.add(temp.getRightChild());
            }
        }
    }

}
