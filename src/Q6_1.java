public class Q6_1 extends Solution{
    public void solve() {
        int N = sc.nextInt(), min = 0;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            min = i;
            for(int j = i + 1; j < N; j++) {
                if(arr[j] < arr[min]) min = j;
            }
            swap(arr, i, min);
        }
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }

}
