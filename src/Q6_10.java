import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Q6_10 extends Solution{
    public void solve() {
        int N = sc.nextInt(), C = sc.nextInt();
        int[] spot = new int[N];
        for(int i = 0; i < N; i++) {
            spot[i] = sc.nextInt();
        }
        Arrays.sort(spot);
        System.out.println(horseCatcher(spot, C));
    }

    public int horseCatcher(int[] spot, int c) {
        boolean done = false;
        HashSet<Integer> hs = new HashSet<>();
        int max = spot[spot.length - 1] - spot[0];
        hs.add(spot[0]);
        hs.add(spot[spot.length - 1]);

        while(!done) {
            for(int i = 3; i <= c; i++) {
                for(int j = 1; j < spot.length - 1; j++) {
                    int temp = spot[j]; // 2 4 8
                    Iterator<Integer> it = hs.iterator();
                    while(it.hasNext()) {
                        int gap = Math.abs(temp - it.next());

                    }
                }
            }

        }

        return max;
    }
}
