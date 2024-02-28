import java.util.Random;

public class basic_for2 {
    public static void main(String[] args) {
        Random ran_Random = new Random();
        int output ;
        
        for(int r = 1 ;r<=5 ;r++){
            for(int l = 1 ;l<=5 ;l++){
            output = ran_Random.nextInt(10);
            System.out.print(output);
            }
            System.out.print("   ");
        }
    }
}
