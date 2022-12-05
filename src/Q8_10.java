import java.util.*;

public class Q8_10 {
    static final int MAX = 7;
    static int result = 0;
    static int[][] board, distance, origin;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        board = new int[MAX + 1][MAX + 1];
        origin = new int[MAX + 1][MAX + 1];
        distance = new int[MAX + 1][MAX + 1];

        for(int i = 1; i < MAX + 1; i++) {
            board[i][0] = 2; // 벽
            for(int j = 1; j < MAX + 1; j++) {
                board[i][j] = sc.nextInt();
                if(i == 1) board[0][j] = 2;
            }
        }
        board[0][0] = 2;


        findShortestPath(1, 1);
        if(distance[MAX][MAX] == 0) System.out.println(-1);
        else System.out.println(distance[MAX][MAX]);

//        board[1][1] = 1;
//        arrayCopy(origin, board);
//        findPath(new Coordinate(1, 1));
//        System.out.println(result);
    }

    public static void findShortestPath(int x, int y) {
        Queue<Coordinate> q = new LinkedList<>();
        Coordinate start = new Coordinate(x, y);
        q.offer(start);
        board[x][y] = 1;
        while(!q.isEmpty()) {
            Coordinate temp = q.poll();
            for(int i = 0; i < 4; i++) {
                Coordinate next = searchNext(temp, i);
                if(next != null) {
                    board[next.getX()][next.getY()] = 1;
                    q.offer(next);
                    distance[next.getX()][next.getY()] = distance[temp.getX()][temp.getY()] + 1;
                }
            }
            // 출력
            for(int[] bo : distance) {
                for(int b : bo) {
                    System.out.print(b + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void findPath(Coordinate start) {

        // 출력
        for(int[] bo : board) {
            for(int b : bo) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        System.out.println();

        if(start.getX() == 7 && start.getY() == 7){
            result++;
            arrayCopy(board, origin);
            return;
        }

        for(int i = 0; i < 4; i++) {
            Coordinate next = searchNext(start, i);
            if(next != null) {
                board[next.getX()][next.getY()] = 1;
                findPath(next);
            }
        }
        arrayCopy(board, origin);

    }

    public static Coordinate searchNext(Coordinate from, int direction) {
        Coordinate to = null;
        int x = from.getX(), y = from.getY();
        switch(direction) {
            case 0:
                to = new Coordinate(x - 1, y); // up
                break;
            case 1:
                to = new Coordinate(x + 1, y); // down
                break;
            case 2:
                to = new Coordinate(x, y - 1); // left
                break;
            case 3:
                to = new Coordinate(x, y + 1); // right
                break;
        }

        assert to != null;
        if(to.getX() <= MAX && to.getY() <= MAX && board[to.getX()][to.getY()] == 0) return to;
        else return null;
    }

    public static void arrayCopy(int[][] board, int[][] origin) {
        for(int i = 0; i < origin.length; i++){
            System.arraycopy(origin[i], 0, board[i], 0, origin[0].length);
        }
    }

}

class Coordinate extends Solution{
    private int x, y;
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void sortX(Coordinate[] arr) {
        int min = 0;
        for(int i = 0; i < arr.length; i++) {
            min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j].getX() < arr[min].getX()) min = j;
            }
            swap(arr, i, min);
        }
    }

    public void sortY(Coordinate[] arr) {
        int min = 0;
        for(int i = 0; i < arr.length; i++) {
            min = i;
            int j = i + 1;
            while(j < arr.length && arr[j].getX() == arr[i].getX()) {
                if(arr[j].getY() < arr[min].getY()) min = j;
                j++;
            }
            swap(arr, i, min);
        }
    }

    public void swap(Object[] arr, int idx1, int idx2) {
        Object temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
