import java.util.Scanner;

public class basic_function {

    public static void line() {
        System.out.println("================================");
    }

    public static void sumVal(int val[]){
        int result = 0;
        for(int run=0;run<=4;run++){
            result += val[run];
        }
        System.out.println("Sum value : "+result);
        line();
    }
    
    public static void main(String[] args) {
        System.out.println("Basic Score Calculate 4.0");
        line();
        int index = 0;
        Scanner jame = new Scanner(System.in);
        int score[] = new int[5];

        while (index <=4) {
            System.out.print("input value  :" );
            score[index]  = jame.nextInt() ;
            index++;
        }
        sumVal(score);
        jame.close();
    }
}
