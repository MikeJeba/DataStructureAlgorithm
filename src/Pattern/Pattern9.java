package Pattern;

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern9(int n){
        for(int row = 0; row < n; row++){
            for(int s = 1; s <= row; s++){
                System.out.print(" ");
            }
            int stcont = 2 * (n - row) - 1;
            for(int col = 1; col <= stcont; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
