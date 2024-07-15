package ArrayBegin;

import java.util.Arrays;

public class Reshape {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] ans = matrixReshape(mat,r,c);
        System.out.println(Arrays.deepToString(ans));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] tempmat = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        if(r*c != m*n){
            return mat;
        }
        for(int i = 0; i < r * c; i++){
            tempmat[i/c][i%c] = mat[i/mat[0].length][i%mat[0].length];
        }
        return tempmat;
    }
}
