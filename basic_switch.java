import java.util.Scanner;

public class basic_switch {
    //ตัวหลัก------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("Basic Function Switch Program");
        Scanner input = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        int ch ;
        double hight,base,side1,side2;
        System.out.println("================== Menu ======================");
        System.out.println("1. Triagle Area");
        System.out.println("2. Boxes Area");
        System.out.println("0. Exit Program");
        line(args);
        System.out.print("Choses is : ");
        ch = input.nextInt();
        switch (ch) {
            case 1:
                s_line(args);
                System.out.println("Triagle Area =================================");
                System.out.print("input hight : ");
                hight = a.nextFloat();
                System.out.print("input Base : ");
                base = a.nextFloat();
                System.out.println("total is : "+(0.5 * (hight * base)));
                line(args);
                main(args);
                a.close();
                break;
            case 2:
                s_line(args);
                System.out.println("Boxes Area =================================");
                System.out.print("input Width : ");
                side1 = a.nextFloat();
                System.out.print("input length : ");
                side2 = a.nextFloat();
                System.out.println("total is : "+(side1 * side2));
                main(args);
                a.close();
                input.close();
                break;
            case 0:
                System.out.println("Exit Program =================================");
                break;
            default:
                System.out.println("Error is not found !!!!");
                break;
        }
        a.close();
        input.close();

    }

    //ตัวเรียกใช้งาน------------------------------------------------------------------
    public static void line(String args[]){
        System.out.println("==============================================");
    }
    public static void s_line(String args[]) {
        System.out.println("-----------------------------------------------");
    
    }
}

