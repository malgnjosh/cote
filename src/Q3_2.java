import java.util.*;
public class Q3_2 {
    public ArrayList<Integer> solve() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }
        int M = in.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < B.length; i++) {
            B[i] = in.nextInt();
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        Arrays.sort(A);
        Arrays.sort(B);

        int j = 0, k = 0;
        while (j < A.length && k < B.length) {
            if (A[j] == B[k]) {
                result.add(A[j]);
                j++;
                k++;
            }
            else if(A[j] < B[k]) j++;
            else k++;
        }
        return result;
    }

}
