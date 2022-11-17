import java.util.*;

public class Q8_2 {

    public static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(), n = sc.nextInt(), sum = 0;
        int[] badooks = new int[n];

        // 입력
        for(int i = 0; i < n; i++) {
            badooks[i] = sc.nextInt();
        }

        sumBadooks(badooks, 0, 0, n, c);
        System.out.println(max);
    }
    public static void sumBadooks(int[] list, int sum, int index, int n, int c) {

        // 마지막 바둑이
        if(index == n) return;

        // 현재 바둑이 스킵
        sumBadooks(list, sum, index + 1, n, c);

        // 현재 바둑이 포함
        sum += list[index];
        if(sum > c) return; // 제한 중량 초과시 리턴
        else {
            if(sum > max) max = sum; // max 갱신
            sumBadooks(list, sum, index + 1, n, c);
        }
    }


}
