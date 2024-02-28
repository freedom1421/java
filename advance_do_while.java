import java.util.Scanner;

public class advance_do_while {
    public static void main(String[] args) {
        int index = 1, choice = 0,chack=0;
        System.out.println("advance while loop program");
        line(args);
        Scanner a = new Scanner(System.in);
        do {
            System.out.print("input measoodkoon : ");
            chack = a.nextInt();
            for(index = chack;index>=2;index--){
                System.out.println("mea " + index);
                sline(args);
                for (int round=1;round<=12;round++) {
                    System.out.println(index +" X " +round+" = "+(index * round));
                }  
                sline(args);
             }
             System.out.println("do you want next round ?");
             System.out.println("1.yes");
             System.out.println("2.No");
             System.out.print("choice is : ");
             choice = a.nextInt();
        } while (choice == 1);
        
        a.close();
    }

    public static void line(String[] args) {
        System.out.println("======================================");
    }

    public static void sline(String[] args) {
        System.out.println("--------------------------------------");
    }
}
