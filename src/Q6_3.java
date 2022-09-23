public class Q6_3 extends Solution {
        public void solve() {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 1; i < N; i++) {
                for(int j = i - 1; j >= 0; j--) {
                    if(arr[i] < arr[j]) swap(arr, i, j);
                }
            }

            for(int a : arr) {
                System.out.print(a + " ");
            }
        }
    }

}
