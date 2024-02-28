import java.util.Scanner;

public class basic_function2 {

    public static void line() {
        System.out.println("================================");
    }

    public static void sumVal(int val[]) {
        int result = 0;
        for (int run = 0; run <= 4; run++) {
            result += val[run];
        }
        System.out.println("Sum value : " + result);
        line();
    }


    public static int check20(int value){
        int chk = 0;
        if(value > 20){
            chk = 0;
            System.out.println(" Score more than 20");
        }else if(value < 0){
            chk = 0;
            System.out.println(" Score more than 0");
        }else if(value <= 20 || value >=0){
            
            chk = 1;
        }else {
            chk = 0;
        }

        return chk;
    }



    public static void main(String[] args) {
        System.out.println("Basic Score Calculate 4.0");
        line();
        int index = 0,check_score = 0;
        Scanner jame = new Scanner(System.in);
        int score[] = new int[5];
        while (index <= 4) {
            check_score = 0;
            System.out.print("input value"+(index+1)+"  :");
            score[index] = jame.nextInt();
            check_score = score[index];
            index += check20(check_score);
        }
        line();
        sumVal(score);
        jame.close();
    }
}
