import java.util.*;

public class Q8_1 {
    private static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), total = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        if(total % 2 != 0) { System.out.println("NO"); return; }
        else total /= 2;

        if(!subSet(arr, 0, 0, n, total)) System.out.println("NO");

    }

    public static boolean subSet(int[] arr, int sum, int index, int n, int total) {
        if(sum == total) {
            System.out.println("YES");
            return true;
        }
        if(index == n) return false;
        if(subSet(arr, sum, index + 1, n, total)) return true;
        else {
            sum += arr[index];
            if(subSet(arr, sum, index + 1, n, total)) return true;
        }


        return false;
    }

}
