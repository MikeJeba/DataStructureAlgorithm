package Pattern;

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    public static void pattern7(int n){
        for(int row = 0; row < n; row++){
            for(int z = 1; z <= row ; z++){
                System.out.print(" ");
            }
            for(int col = 1; col <= n - row; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
