class TreeNode {
    private int data;
    private int level;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }
    public TreeNode(int data, int level) { this.data = data; this.level = level; }
    public int getData() {
        return data;
    }

    public int getLevel() { return level; }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLevel(int level) { this.level = level; }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
