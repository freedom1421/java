import java.util.Scanner;

public class rueangsak_2 {
    public static void main(String[] args) {
        int a,b=1;
        Scanner input = new Scanner(System.in);
        System.out.println("test 2 ---------------------------");
        System.out.println("ID : 65309010010");
        System.out.println("Name : Rueangsak Panklang");
        line(args);
        System.out.print("input number : ");
        a = input.nextInt();
        line(args);
        for(int c=1;c<=a;c++){
            b = b*c;
            System.out.print(c);
            if (c<a) {
                System.out.print(" X ");
            }
        };
        System.out.println(" = " + b);
        input.close();
    }

    public static void line(String[] args) {
        System.out.println("====================================");
    }
}
