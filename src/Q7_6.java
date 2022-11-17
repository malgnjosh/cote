import java.util.*;

public class Q7_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        subSet(list,1, N);
    }
    public static void subSet(ArrayList<Integer> list, int s, int N) {

        if(s == N + 1) {
            for(int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            return;
        }

        list.add(s);
        subSet(list,s + 1, N);

        list.remove(list.lastIndexOf(s));
        subSet(list,s + 1, N);

    }
}
