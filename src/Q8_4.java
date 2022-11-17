import java.util.*;
public class Q8_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        //int[] arr = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();
        perm(arr, n, m, -1);
    }

    public static void perm(ArrayList<Integer> arr, int n, int m, int x) {
        //if(x >= 0) System.out.print( + " ");
        for(int i = 0; i < n; i++) {
            //System.out.print(arr[i] + " ");
            if(m - 1 > 0) perm(arr, n, m - 1, i);
            else System.out.println();
        }
    }
}
