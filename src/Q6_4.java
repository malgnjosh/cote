import java.util.*;

public class Q6_4 extends Solution{
    int S = sc.nextInt(), N = sc.nextInt(); // 캐시 사이즈, 작업 개수
    public void solve() {

        int[] process = new int[N];
        LinkedList<Integer> mem = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            process[i] = sc.nextInt();
        }

        for(int p : process) {
            if(mem.contains(p)) { // 메모리에 존재
                mem.remove(mem.indexOf(p));
                mem.addFirst(p);
            }
            else {
                if(mem.size() < S) mem.addFirst(p); // 공간 충분
                else if(mem.size() == S) { // 가득 참
                    mem.removeLast();
                    mem.addFirst(p);
                }
            }
        }

        for(Object m : mem.toArray()) {
            System.out.print((int)m + " ");
        }
    }

    public void solve2() {
        int[] cache = new int[S];
        int[] input = new int[N];

        for(int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        for(int i = 0; i < S; i++) {
            cache[i] = 0;
        }

        for(int in : input) {
            int temp = S - 1;

            for(int i = 0; i < S; i++) {
                if(in == cache[i]) {
                    temp = i;
                }
            }
            for(int i = temp; i > 0; i--) {
                cache[i] = cache[i-1];
            }
            cache[0] = in;
            for(int x : cache) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        for(int x : cache) {
            System.out.print(x + " ");
        }
    }
}
