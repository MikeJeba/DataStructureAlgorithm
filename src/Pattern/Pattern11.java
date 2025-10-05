package Pattern;

public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }

    public static void pattern11(int n){
        for(int row = 0; row < n; row++){
            int scont = row;
            for(int s = 1; s <= scont; s++){
                System.out.print(" ");
            }
            int colcont = n - row;
            for(int col = 0; col < colcont; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
