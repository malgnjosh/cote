import java.util.HashSet;

class Q6_5 extends Solution{
    public void solve() {
        int N = sc.nextInt(), min = 0;
        HashSet<Integer> hs = new HashSet<>();
        String result = "U";
        for(int i = 0; i < N; i++) {
            if(!hs.add(sc.nextInt())) result = "D";
        }

        System.out.println(result);
    }
}
