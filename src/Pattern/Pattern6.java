package Pattern;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    public static void pattern6(int n){
        for(int row = 1; row <= n; row++){
            int spacecont = n - row;
            for(int col = 1; col <= spacecont;col++){
                System.out.print(" ");
            }
            for(int z = 1; z <= row; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
