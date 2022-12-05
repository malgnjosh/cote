import java.util.*;

public class Q9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        Person[] people = new Person[n];

        for(int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            people[i] = new Person(h, w);
        }

        Person.sortX(people);
        count++; //키가 제일 큼

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) { // 나보다 키 큰 놈 중에서 나보다 무거운 놈이 있는지 확인
                if(people[j].getWeight() > people[i].getWeight()) break; // 탈락
                if(j == i - 1) count++; // 통과
            }

            // for문 돌지말고 MAX값만 갱신해주면 됨!
        }

        System.out.println(count);
    }
}

class Person {
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int height;
    int weight;

    Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public static void sortX(Person[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            max = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j].getHeight() > arr[max].getHeight()) max = j;
            }
            swap(arr, i, max);
        }
    }

    public static void swap(Object[] arr, int idx1, int idx2) {
        Object temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
