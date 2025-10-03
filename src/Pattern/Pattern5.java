package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    public static void pattern5(int n){
        for(int row = 1; row <= 2 * n - 1; row++){
            int stars = row <= n ? row : 2 * n - row;
            for(int col = 1; col <= stars; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
