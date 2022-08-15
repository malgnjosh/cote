import java.util.ArrayList;
public class Main {
    public static void main(String[] args){

        Q3_2 q3_2 = new Q3_2();
        ArrayList<Integer> al = q3_2.solve();
        for(int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

}

