package Pattern;

public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }

    public static void pattern12(int n){
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
