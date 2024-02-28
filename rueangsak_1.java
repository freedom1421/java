import java.util.Scanner;

public class rueangsak_1 {
    public static void main(String[] args) {
        int a ;
        Scanner input = new Scanner(System.in);
        System.out.println("test 1 ---------------------------");
        System.out.println("ID : 65309010010");
        System.out.println("Name : Rueangsak Panklang");
        line(args);
        System.out.print("input number : ");
        a = input.nextInt();
        line(args);
        System.out.print("output number of count : ");
        for(int c = 1;c<=a;c++){
            System.out.print(c + " ");
        };
        input.close();
    }

    public static void line(String[] args) {
        System.out.println("====================================");
    }
    
}