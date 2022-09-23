import java.util.*;
public class Solution {
    Scanner sc = new Scanner(System.in);

    public void solve() {

    }

    public void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
