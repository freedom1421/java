import java.util.Random;
public class basic_ramdom {
    public static void main(String[] args) {
        int k ;
        System.out.println("Random Programs");
        line(args);
        Random arm = new Random();
        for(int r=0;r<=11;r++){
        k = arm.nextInt(10);
        System.out.print(k +"  ");
        }
        System.out.print("\n");
        line(args);
    }

    public static void line(String[] args) {
        System.out.println("=========================================");
    }
}
