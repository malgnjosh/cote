import java.util.Arrays;

class Q6_8 extends Solution{
    public void solve() {
        int N = sc.nextInt(), X = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int result = binarySearch(arr, 0, arr.length, X);
        System.out.println(result + 1);
        System.out.println(iBinarySearch(arr, 0, arr.length, X));
    }

    public int binarySearch(int[] arr, int first, int last, int x) {
        int mid = (last + first) / 2;
        if(x == arr[mid]) return mid;
        else if(x > arr[mid]) return binarySearch(arr, mid + 1, last, x);
        else if(x < arr[mid]) return binarySearch(arr, first, mid, x);
        return -1;
    }

    public int iBinarySearch(int[] arr, int first, int last, int x) {
        int mid = (last + first) / 2;
        while(first <= last) {
            if(x == arr[mid]) return mid;
            else if(x < arr[mid]) last = mid - 1;
            else first = mid + 1;
        }

        return mid;
    }
}
