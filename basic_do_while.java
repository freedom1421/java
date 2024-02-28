public class basic_do_while {
    public static void main(String[] args) {
        int index = 1,choice = 0;
        do {
            for(index = 1;index<=12;index++){
                System.out.println("7 x "+index+" = "+(7*index));
            }
        } while (choice == 1);



    }
    public static void line(String[] args) {
        System.out.println("======================================");
    }
    public static void sline(String[] args) {
        System.out.println("--------------------------------------");
    }
}
