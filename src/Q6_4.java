import java.util.*;

public class Q6_4 extends Solution{
    public void solve() {
        int S = sc.nextInt(), N = sc.nextInt(); // 캐시 사이즈, 작업 개수
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
}
