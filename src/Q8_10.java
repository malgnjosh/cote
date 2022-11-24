//import java.util.*;
//
//public class Q8_10 {
//    public static final int MAX = 7;
//    public static int result = 0;
//    public static CoordinateXY pos;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] board = new int[MAX + 1][MAX + 1];
//
//        pos = new CoordinateXY(1, 1);
//
//        for(int i = 1; i < MAX + 1; i++) {
//            board[i][0] = 2; // 벽
//            for(int j = 1; j < MAX + 1; j++) {
//                board[i][j] = sc.nextInt();
//                if(i == 1) board[0][j] = 2;
//            }
//        }
//        board[0][0] = 2;
//        board[1][1] = -1;
//
//        // 출력
//        for(int[] bo : board) {
//            for(int b : bo) {
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }
//
//        findPath(board, pos);
//        System.out.println(result);
//    }
//
//    public static boolean findPath(int[][] board, CoordinateXY pos) {
//        int[][] temp = new int[MAX + 1][MAX + 1];
//        arrayCopy(board, temp);
//
//        int cnt = 0;
//        if(pos.getX() == 7 && pos.getY() == 7) {
//            result++;
//            return true;
//        }
//
//        for(int i = 0; i < 4; i++) {
//
//         //   if(searchNext(board, pos))
//        }
//        return false;
//    }
//
//    public static boolean moveBack(int[][] board, int[] pos) {
//        boolean ret = true;
//
//        if(pos[0] == 7 && pos[1] == 7) { return false; }
//
//        board[pos[0]][pos[1]] = -1; // 현재위치
//        if(pos[0] + 1 <= MAX && board[pos[0] + 1][pos[1]] == -1) pos[0]++;
//        else if(pos[0] - 1 <= MAX && board[pos[0] - 1][pos[1]] == -1) pos[0]--;
//        else if(pos[1] + 1 <= MAX && board[pos[0]][pos[1] + 1] == -1) pos[1]++;
//        else if(pos[1] - 1 <= MAX && board[pos[0]][pos[1] - 1] == -1) pos[1]--;
//        else ret = false;
//
//        return ret;
//    }
//    public static boolean moveNext(int[][] board, CoordinateXY from, String direction) {
//        CoordinateXY to;
//        switch(direction) {
//            case "left": to = new CoordinateXY(from.getY() - 1, from.getX());
//            case "right": to = new CoordinateXY(from.getY() + 1, from.getX());
//            case "up": to = new CoordinateXY(from.getY(), from.getX() - 1);
//            case "down": to = new CoordinateXY(from.getY(), from.getX() + 1);
//        }
//
//
//        //if(searchNext(board, to)
//    }
//    public static boolean searchNext(int[][] board, CoordinateXY from, String direction) {
//        CoordinateXY to;
//        switch(direction) {
//            case "left": to = new CoordinateXY(from.getY() - 1, from.getX());
//            case "right": to = new CoordinateXY(from.getY() + 1, from.getX());
//            case "up": to = new CoordinateXY(from.getY(), from.getX() - 1);
//            case "down": to = new CoordinateXY(from.getY(), from.getX() + 1);
//        }
//
//        return to.getX() <= MAX && to.getY() <= MAX && board[to.getY()][to.getX()] == 0;
//    }
//
//    public static void arrayCopy(int[][] A, int[][] B) {
//        for (int i = 0; i < A.length; i++) {
//            System.arraycopy(A[i], 0, B[i], 0, A[i].length);
//        }
//    }
//}
//
