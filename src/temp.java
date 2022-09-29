public class temp extends Solution{
    public void solve() {
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] cache = new int[s];
        int[] input = new int[n];


        for(int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        for(int i = 0; i < s; i++) {
            cache[i] = 0;
        }

        for(int in : input) {
            int temp = s - 1;

            for(int i = 0; i < s; i++) {
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
