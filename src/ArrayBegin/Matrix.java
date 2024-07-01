package ArrayBegin;

public class Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int res = diagonalSum(mat);
        System.out.print(res);
    }
    public static int diagonalSum(int[][] mat) {
        int temp = 0;
        int n = mat.length;
        for(int i = 0; i < n; i++){
            temp += mat[i][i];
            if(i != n - 1 - i){
                temp += mat[i][n - 1 -i];
            }
        }
        return temp;
    }
}
