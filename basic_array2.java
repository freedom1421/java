import java.util.Scanner;

public class basic_array2 {
    public static void main(String[] args) {
        System.out.println("test Array 1 dimension program");
        line(args);
        Scanner input = new Scanner(System.in);
        int temp,r = 0,check=0,total = 0;
        int index[] = new int[5];
        
        while (r<5) {
            check = 0;
            while (check == 0) {
                System.out.print("input score "+(r+1)+" : ");
                temp = input.nextInt();
                if (temp < 0) {
                    System.out.println("Score less than 0 !!!! ");
                    check = 0;
                } else if (temp >20) {
                    System.out.println("plese more than 20 !!!! ");
                    check = 0;
                }else if(index[r] <= 20 || index[r] == 0){
                    index[r] = temp;
                    total += temp;
                    check = 1;
                }else{
                    System.out.println("invalid value");
                    check = 0;
                }
            }
            r+=1;
            
        }

        sline(args);
        System.out.print("value of number : ");
        for (int c = 0;c<5;c++) {
            System.out.print(index[c]+" ");
        }
        System.out.println("");
        sline(args);
        System.out.print("total of score : " +total);
        input.close();

    }





    public static void line(String[] args) {
        System.out.println("================================");
    }

    public static void sline(String[] args) {
        System.out.println("--------------------------------");
    }
}
