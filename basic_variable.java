import java.util.Scanner;
public class basic_variable {
    public static void main(String[] args) {
        System.out.println("Basic variable program");
        System.out.println("===========================");
        int num1 =0,num2 = 2;
        int num3,num4;
            Scanner input = new Scanner(System.in);
            System.out.println(num1);
            System.out.println(num2);
            System.out.println("num1 + num2 ="+(num1+num2));
            System.out.println("===========================");
            System.out.print("input number 1 : ");
            num3 = input.nextInt();
            System.out.print("Input number 2 : ");
            num4 = input.nextInt();
            System.out.println("Ans : "+(num3+num4));
            System.out.println("===========================");
            System.out.println("test string");
            System.out.println("==========================="); 
            String sm1;
            Scanner get_str = new Scanner(System.in);
            System.out.print("input your name : ");
            sm1 = get_str.next();
            System.out.println("My name is : "+ sm1);
            System.out.println("==========================="); 
        get_str.close();
        input.close();
    }
    
}
