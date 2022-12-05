import java.util.*;

public class Q9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] counter = new int[72];
        ArrayList<Guest> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(i, new Guest(sc.nextInt(), sc.nextInt()));
        }

        for(int i = 0; i < n; i++) {
            int s = list.get(i).getStart(), e = list.get(i).getEnd();
            for(int j = s; j < e; j++) {
                counter[j] += 1;
            }
        }
        int max = 0;
        for(int c : counter) {
            if(c > max) max = c;
        }

        System.out.println(max);
//        for(int i = 0; i < n; i++) {
//            System.out.println(list.get(i).getStart() + " " + list.get(i).getEnd());
//        }

        /* 시간 오름차순, 알파벳 오름차순으로 정렬한 뒤 e면 count에서 1을 빼주고 [퇴장] s면 1을 더해준다. [입장] count가 result 보다 크면 갱신해준다. */


    }
}

class Guest {
    int start;
    int end;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public Guest(int start, int end) {
        this.start = start;
        this.end = end;
    }
}