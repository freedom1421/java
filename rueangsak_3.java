import java.util.Scanner;

public class rueangsak_3 {
    public static void main(String[] args) {
        int a,b;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("test 3 ---------------------------");
        System.out.println("ID : 65309010010");
        System.out.println("Name : Rueangsak Panklang");
        line(args);
        System.out.print("input number1 : ");
        a = input1.nextInt();
        System.out.print("input number2 : ");
        b = input2.nextInt();
        line(args);
        if (a<b) {
            for(int r=a;r<=b;r++){
                if( ( r % 2 ) == 1 ) {
                    System.out.print(r+" ");
                }
            };
        }else{
            System.out.println("Invalid number1 must < number2");
        }
        
        input1.close();
        input2.close();
    }

    public static void line(String[] args) {
        System.out.println("====================================");
    }
}
