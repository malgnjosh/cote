public class Q7_8 extends Solution {
    public void solve() {
        int H = sc.nextInt(), S = sc.nextInt();
        int quotient1 = 0, remainder1 = 0, quotient2 = 0, remainder2 = 0;

        int diff = S - H;
        if(diff < 0) System.out.println(H - S);
        else if(diff == 0) System.out.println(0);
        else {
            quotient1 = diff / 5;
            remainder1 = diff % 5;

            quotient2 = quotient1 + 1;
            remainder2 = 5 * quotient2 - diff;

            System.out.println(Math.min(quotient1 + remainder1, quotient2 + remainder2));
        }
    }
}
