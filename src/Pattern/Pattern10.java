package Pattern;

public class Pattern10 {
    public static void main(String[] args) {
        pattern10(5);
    }

    public static void pattern10(int n){
        for(int row = 1; row <= n; row++){
            int scont = n - row;
            for(int s = 1; s <= scont; s++){
                System.out.print(" ");
            }
            int colcont = row - 1;
            for(int col = 0; col <= colcont; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
