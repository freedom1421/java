public class array_basic {
    public static void main(String[] args) {
        int a[][] = new int[5][10];
        a[2][0] = 30;

        for (int x=0;x<=4;x++) {
            a[x][x] = 10;
        }

        for (int x=0;x<=4;x++) {
        System.out.print(a[2][0]+" ");
        }
    
    }
}
