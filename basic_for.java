public class basic_for {
    public static void main(String[] args) {
        System.out.println("Basic For Loop");
        line(args);
        int r=0;
        for(r=2;r<=12;r++){
            System.out.println("7 x "+ r +" = "+ (7*r));
        }
        System.out.println(r);
    }
    public static void line(String[] args) {
        System.out.println("======================================");
    }
}
