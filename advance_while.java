import java.util.Scanner;

public class advance_while {
    public static void main(String[] args) {
        System.out.println("advance while loop program");
        System.out.println("----------------------------");
        Scanner a = new Scanner(System.in);
        int mt_value = 0;
        int choice = 1;
        int index = mt_value;
        while (choice == 1) {
            System.out.print("input measoodkoon : ");
            mt_value = a.nextInt();
            for(index = mt_value;index>=2;index--){
                System.out.println("mea " + index);
                System.out.println("=================");
                for (int round=1;round<=12;round++) {
                    System.out.println(index +" X " +round+" = "+(index * round));
                }  
                System.out.println("=================");
             }
            System.out.println("do you want next round ?");
            System.out.println("1.yes");
            System.out.println("2.No");
            System.out.print("choice is : ");
            choice = a.nextInt();
        }

        a.close();
    }
}
