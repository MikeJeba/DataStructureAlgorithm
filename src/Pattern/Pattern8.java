package Pattern;

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }

    public static void pattern8(int n){
        for(int row = 1; row <= n; row++){
                int spcont = n - row;
                for(int sp = 1; sp <= spcont; sp++ ){
                    System.out.print(" ");
                }
                int stcont = 2 * row - 1;
                for(int st = 1; st <= stcont; st++){
                    System.out.print("*");
                }

            System.out.println();
        }
    }
}
