public class Q6_2 extends Solution{
    public void solve() {
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = N - 1; i > 0; i--) {
            for(int j = i - 1; j >= 0; j--) {
                if(arr[i] < arr[j]) swap(arr, i, j);
            }
        }

        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}
