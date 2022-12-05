import java.util.*;
public class Q8_4 {
    public static int n, m;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        perm(n, m, -1);
    }

    public static void perm(int n, int m, int x) {
        if(x > 0) {
            arr[x] = x;
        }
        if(m == 0) {
            for(int i = 0; i <= arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        for(int i = 0; i < n; i++) {
            if(m - 1 > 0) perm(n, m - 1, i);
            else System.out.println();
        }
    }
}
