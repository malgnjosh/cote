public class Q6_7 extends Solution{
    public void solve() {
        int N = sc.nextInt();
        Coordinate[] xys = new Coordinate[N];
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xys[i] = new Coordinate(x, y);
        }

        sortX(xys);
        sortY(xys);

        for(Coordinate o : xys) {
            System.out.println(o.getX() + " " + o.getY());
        }
    }
    public void sortX(Coordinate[] arr) {
        int min = 0;
        for(int i = 0; i < arr.length; i++) {
            min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j].getX() < arr[min].getX()) min = j;
            }
            swap(arr, i, min);
        }
    }

    public void sortY(Coordinate[] arr) {
        int min = 0;
        for(int i = 0; i < arr.length; i++) {
            min = i;
            int j = i + 1;
            while(j < arr.length && arr[j].getX() == arr[i].getX()) {
                if(arr[j].getY() < arr[min].getY()) min = j;
                j++;
            }
            swap(arr, i, min);
        }
    }


}