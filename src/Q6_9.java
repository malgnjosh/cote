public class Q6_9 extends Solution{
    public void solve() {
        //입력
        int N = sc.nextInt(), D = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //평균값 산정 45 / 3 = 15
        int min = 0, sum = 0;
        for(int a : arr) {
            sum += a;
        }
        min = sum / D;

        min = record(arr, min, D);
        System.out.println(min);
    }
    public int record(int[] arr, int min, int d) {
        boolean notFailed = true;

        while(notFailed) {
            int sum = 0, dvd = 1;

            for(int i = 0; i < arr.length; i++) { // 16 17
                sum += arr[i]; // 1 2 3 4 5 6 21 / 6 7 8 / 8 9
                // sum이 min을 초과하면 dvd를 교체
                if(sum > min) { // 21 > 15 / 21 > 15 / 17 > 15
                    sum = arr[i]; // 6 / 8 / 9
                    dvd++; // 2 / 3 / 4
                    // dvd가 부족하면 실패
                    if(dvd > d) { // 4 > 3
                        notFailed = false;
                        break;
                    }
                }
            }
            // 실패한 경우 min을 1 증가시켜 다시 시도
            if(!notFailed) {
                min++; // 16
                notFailed = true;
            }
            // 성공
            else break;
        }

        return min;
    }
}
