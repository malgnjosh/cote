public class MyStack {
    private static final int MAX_SIZE = 100;
    private int[] stack = new int[MAX_SIZE];
    private int top = -1;

    public boolean isEmpty() {
        if(top == -1) return true;
        else return false;
    }

    public boolean isFull() {
        if(top >= MAX_SIZE) return true;
        else return false;
    }

    public boolean push(int val) {
        if(this.isFull()) return false;
        else stack[++top] = val;
        return true;
    }

    public int pop() {
        if(this.isEmpty()) return -1;
        else return stack[top--];
    }


}
