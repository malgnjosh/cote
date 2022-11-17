import java.util.Scanner;

public class Q8_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), R = sc.nextInt();

        System.out.println(C(N, R));

    }

    public static int C(int n, int r) {
        if(r == 0 || r == n) return 1;
        else if(n == 0) return 0;
        else if(r == 1) return n;

        return C(n - 1, r - 1) + C(n - 1, r);
    }
}
