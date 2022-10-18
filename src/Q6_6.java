class Q6_6 extends Solution {
    public void solve() {
        int N = sc.nextInt();
        int[] students = new int[N];
        for(int i = 0; i < N; i++) {
            students[i] = sc.nextInt();
        }
        int i = 0, j = N - 1;

        while(j > -1 && students[j] >= students[j - 1]) j--;
        while(i < j && students[i] <= students[i + 1]) {
            if(students[i] > students[j]) break;
            i++;
        }

        System.out.println((i + 1) + " " + (j + 1));
    }

}
