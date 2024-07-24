package ArrayMedium;

import java.util.*;

public class SprialMatrixI {
    public static void main(String[] args) {
        int n = 1;
        System.out.print(Arrays.deepToString(generateMatrix(n)));
    }
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int rowbegin = 0;
        int colbegin = 0;
        int rowend = n - 1;
        int colend = n - 1;
        int num = 1;
        while(rowbegin <= rowend && colbegin <= colend){
            //tranverse left
            for(int i = colbegin; i <= colend; i++ ){
               res[rowbegin][i] = num++;
            }
            rowbegin++;
            //tranverse down
            for(int j = rowbegin; j <= rowend; j++){
                res[j][colend] = num++;
            }
            colend--;
            //tranverse right
            if(rowbegin <= rowend) {
                for (int k = colend; k >= colbegin; k--) {
                    res[rowend][k] = num++;
                }
                rowend--;
            }
            //tranverse up
            if(colbegin <= colend){
                for(int l = rowend; l >= rowbegin; l--){
                    res[l][colbegin] = num++;
                }
                colbegin++;
            }
        }
        return res;
    }
}
