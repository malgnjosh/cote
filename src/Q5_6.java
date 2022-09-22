import java.util.*;

public class Q5_6 {
    public void solve() {
        //입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt(), count = 0, result = -1;

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i < N + 1; i++) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            for(int i = 1; i < K; i++) {
                queue.offer(queue.remove());

            }
        }

        //list.getFirst();


//        int[] T = new int[N];
//
//        for(int i = 0; i < T.length; i++) {
//            T[i] = 1;
//        }
//
//        int i = -1;
//        while(count < N) {
//            //이동
//            if(count <= N/K) { // 첫번째 패스
//                i = (i + K) % 8;
//            }
//            else {
//                int j = 1, k = 0;
//                while(k < K) {
//                    if(T[(i + j) % 8] == 1) k++;
//                    if(k < K) j++;
//                }
//                i = (i + j) % 8;
//            }
//
//            //처리
//            if(T[i] == 1) {
//                T[i] = 0;
//                count++;
//                result = i;
//            }
//        }
//
//        System.out.println(result + 1);



    }
}
