class Q6_3 extends Solution {
        public void solve() {
            int N = sc.nextInt(), tgt = 0;
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 1; i < N; i++) {
                tgt = i;
                for(int j = i - 1; j >= 0; j--) {
                    if(arr[tgt] < arr[j]) {
                        swap(arr, tgt, j);
                        tgt--;
                    }
                }
                for(int a : arr) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }

            for(int a : arr) {
                System.out.print(a + " ");
            }
        }
}
