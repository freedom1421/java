import java.util.Scanner;

public class basic_array_2dimention {
    public static void main(String[] args) {
        System.out.println("test Array 2 dimension program");
        line(args);
        Scanner input = new Scanner(System.in);
        int score[][] = new int[4][5];

        for (int index = 0;index<4;index++) {
            System.out.println("input score number "+(index + 1)+" : ");
            System.out.print("input s1 : ");
            score[index][0] = input.nextInt();
            System.out.print("input s2 : ");
            score[index][1] = input.nextInt();
            System.out.print("input s3 : ");
            score[index][2] = input.nextInt();
            System.out.print("input s4 : ");
            score[index][3] = input.nextInt();
            System.out.print("input s5 : ");
            score[index][4] = input.nextInt();
            sline(args);
        }

        for (int index = 0;index<4;index++) {
            System.out.print("score number "+(index + 1) +" : ");
            for (int run = 0;run<5;run++) {
                System.out.print(score[index][run]+" ");
            }
            System.out.println(" ");
        }
    input.close();
    }

    public static void line(String[] args) {
        System.out.println("================================");
    }

    public static void sline(String[] args) {
        System.out.println("--------------------------------");
    }
}
