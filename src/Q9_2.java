import java.util.*;

public class Q9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result = 0;
        ArrayList<Schedule> schedules = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            schedules.add(i, new Schedule(x, y));
        }
        // 빨리 끝나는 것을 선택 - Y 오름차순 정렬, 같으면 X 오름 정렬
        Collections.sort(schedules);
        //가장 먼저 끝나는 회의 시간을 end로 설정
        int end = schedules.get(0).getEnd();
        result = 1;
        for(Schedule s : schedules) {
            if(s.getStart() >= end) {
                result++; // end 이후에 시작하는 경우 회의가능
                end = s.getEnd();
            }
        }

        System.out.println(result);
    }
}

class Schedule implements Comparable<Schedule>{

    int start;
    int end;

    Schedule(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }
    public int getEnd() {
        return end;
    }

    @Override
    public int compareTo(Schedule s) {
        if(this.end == s.end) return this.start - s.start;
        else return this.end - s.end; //this가 s보다 크면 양수를 리턴 오름차순
    }
}
