import java.util.*;

public class Q9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxD = 0, sum = 0, cnt = 0;

        ArrayList<Schedule2> schedules = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int pay = sc.nextInt(), day = sc.nextInt();
            schedules.add(i, new Schedule2(pay, day));
            if(day > maxD) maxD = day;
        }
        int[] result = new int[maxD + 1];

        Collections.sort(schedules);

//        for(int i = 0; i < n; i++) {
//            System.out.println(schedules.get(i).getPay() + " " + schedules.get(i).getDay());
//        }
        for (Schedule2 schedule : schedules) {
            int nextDay = schedule.getDay(); // 60 3
            if (cnt == maxD) break; // 스케줄이 가득차면 종료
            if (result[nextDay] == 0) { // 비어있으면 돈을 벌 수 있다.
                result[nextDay] = schedule.getPay();
                cnt++;
            } else { // 비어있지 않으면
                int j = nextDay - 1;
                while (j > 0) { // 시간을 거슬러 빈 곳을 찾는다.
                    if (result[j] == 0) {
                        result[j] = schedule.getPay();
                        break;
                    }
                    j--;
                }
            }
        }

        for(int i = 1; i < result.length; i++) {
            sum += result[i];
        }
        System.out.println(sum);

        /* 우선순위 큐 - 우선순위가 높은 값을 먼저 꺼낸다.
        * PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 큰 거
        * */
        /* 날짜 내림차순 돈 오름차순 정렬 후 pq에 3일짜리 모두 삽입 후 하나 아웃
        * 2일짜리 모두 삽입 후 하나 아웃
        * 1일짜리 모두 삽입 후 하나 아웃
        * 3개 선택 완료, 종료*/

    }
}

class Schedule2 implements Comparable<Schedule2> {
    int pay;

    public int getPay() {
        return pay;
    }

    public int getDay() {
        return day;
    }

    int day;

    public Schedule2(int pay, int day) {
        this.pay = pay;
        this.day = day;
    }

    @Override
    public int compareTo(Schedule2 s) {
        return s.pay - this.pay;
    } //큰놈 양수, PAY 내림차순
}
