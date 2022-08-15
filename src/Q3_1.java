import java.util.Scanner;
public class Q3_1 {
    public int[] solve() {
        Scanner in = new Scanner(System.in);
        int arr1Size = in.nextInt();
        int[] arr1 = new int[arr1Size];
        for (int i = 0; i < arr1Size; i++) {
            arr1[i] = in.nextInt();
        }
        int arr2Size = in.nextInt();
        int[] arr2 = new int[arr2Size];
        for (int i = 0; i < arr2Size; i++) {
            arr2[i] = in.nextInt();
        }

        int[] arr3 = new int[arr1Size + arr2Size];

        int i = 0, j = 0, k = 0;
        while (j < arr1.length && k < arr2.length) {
            if (arr1[j] <= arr2[k]) arr3[i++] = arr1[j++];
            else arr3[i++] = arr2[k++];
        }
        if (j >= arr1.length) {
            while (k < arr2.length) arr3[i++] = arr2[k++];
        }
        else if (k >= arr2.length) {
            while (j < arr1.length) arr3[i++] = arr1[k++];
        }

        return arr3;
    }
}
