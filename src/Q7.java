import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("1. " + n + "까지의 자연수 출력");
        printNumbers(n);
        System.out.println();

        System.out.println("2. " + n + "-> 2진수로 변환");
        printBinary(n);
        System.out.println();

        System.out.println("3. " + n + "! = " + factorial(n));

        System.out.println("4. " + n + "개의 피보나치 수열");
        System.out.print(" recursive: ");
        printFibo(n);
        System.out.println();
        System.out.print(" iterative: ");
        iterativePrintFibo(n);


    }

    public static void printNumbers(int n) {
        if(n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void printBinary(int n) {
        if(n == 1) {
            System.out.print(1);
            return;
        }
        printBinary(n / 2);
        System.out.print(n % 2);
    }

    public static int factorial(int n) {
        if(n == 1) return 1;
        else if(n == 2) return 2;
        return n * factorial(n - 1);
    }

    public static int fibo(int n) {
        if(n == 1 || n == 2) return 1;
        return fibo(n - 2) + fibo(n - 1);
    }

    public static void printFibo(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(fibo(i + 1) + " ");
        }
    }

    public static int iterativePrintFibo(int n) {

        int[] tempArr = new int[n];

        tempArr[0] = 1;
        tempArr[1] = 1;

        for(int i = 2; i < n; i++) {
            tempArr[i] = tempArr[i - 1] + tempArr[i - 2];
        }

        for(int a : tempArr) {
            System.out.print(a + " ");
        }

        return 0;
    }

}
