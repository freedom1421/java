import java.util.Scanner;
public class basic_if_e {

   public static void main(String args[]) {
    System.out.println("Program Pizza");  
    line(args);
    int money = 0, price = 79 , value;
    int check = 0, cola_check=0;
    int cheese = 15, cheesey = 10,pepsi = 12;
    Scanner input = new Scanner(System.in);
    Scanner a = new Scanner(System.in);
    System.out.print("enter value of pizza : ");
    value = input.nextInt();
    System.out.println("do you want option !!");
    System.out.print("yes 1 / no 0 : ");
    check = a.nextInt();
    if (check == 0) {
        System.out.println("you don't want option !");  
    }
    else if(check == 1) {
        s_line(args);
        System.out.println("do you want Cheese edge!");
        System.out.print("yes 1 / no 0 : ");
        check = a.nextInt();
        if (check == 1) {
            money = money + (cheese * value);
        }
        s_line(args);
        System.out.println("do you want sprikle of cheese !");
        System.out.print("yes 1 / no 0 : ");
        check = a.nextInt();
        if (check == 1) {
            money = money + (cheesey * value);
        }
        s_line(args);
        System.out.println("do you want cola !");
        System.out.print("yes 1 / no 0 : ");
        check = a.nextInt();
        if (check == 1) {
            System.out.print("do you want value of cola : ");
            cola_check = input.nextInt();
            money = money + (pepsi*cola_check);
        }

    }else{
        System.out.println("pleses input 0 or 1");
        System.exit(0);
    }
    for(int r=1;r<=value;r++){
        money += price;
    }
    line(args);
    System.out.print("money of Pizza : ");
    System.out.println(money);
    line(args);
    input.close();
    a.close();
    }


    public static void line(String args[]){
         System.out.println("=======================");
    }
    public static void s_line(String args[]){
        System.out.println("----------------");
    }
}


