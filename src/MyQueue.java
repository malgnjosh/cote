public class MyQueue {
    private static final int MAX_SIZE = 100;
    private int[] queue = new int[MAX_SIZE];
    private int front = -1, rear = -1;

    public boolean isEmpty() {
        if(front == rear) return true;
        else return false;
    }

    public boolean isFull() {
        if(rear == MAX_SIZE - 1) return true;
        else return false;
    }

    public boolean enqueue(int val) {
        if(this.isFull()) return false;
        else {
            rear++;// = (rear + 1) % MAX_SIZE;
            queue[rear] = val;
            return true;
        }
    }

    public int dequeue() {
        if(this.isEmpty()) return -1;
        else {
            front++;// = (front + 1) % MAX_SIZE;
            return queue[front];
        }
    }

}
