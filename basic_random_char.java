import java.util.Random;

public class basic_random_char {
    public static void main(String[] args) {
        Random q= new Random();
        int a , b;
        System.out.println("Random Char And Number Programs"); 
        line(args);
        for(int i = 1; i<=5;i++){
                for(int l=1;l<=5;l++){
                    a = q.nextInt(2);
                    if (a == 0) {
                        b = q.nextInt(10);
                        System.out.print(b);
                    }else{
                        System.out.print((char)((int)(Math.random()*( 'Z' - 'A' + 1)+ 'A' )));  
                    }
                }
            System.out.println();
        }  
        line(args);
    }   
    
    public static void line(String[] args) {
        System.out.println("=================================");
    }
}



