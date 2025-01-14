package ArrayGreek;

import java.util.Arrays;

public class Sample {

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int num = 1;
        int rowbegin = 0;
        int colbegin = 0;
        int rowend = n - 1;
        int colend = n - 1;
        while(rowbegin <= rowend && colbegin <= colend){
            //transverse left
            for(int i = colbegin; i <= colend; i++){
                res[rowbegin][i] = num++;
            }
            rowbegin++;

            //transverse down
            for(int j = rowbegin; j <= rowend; j++){
                res[j][colend] = num++;
            }
            colend--;

            //transverse right
            if(rowbegin <= rowend){
                for(int k = colend; k >= colbegin; k--){
                    res[rowend][k] = num++;
                }
            }
            rowend--;

            //transverse up
            if(colbegin <= colend){
                for(int l = rowend; l >= rowbegin; l--){
                    res[l][colbegin] = num++;
                }
            }
            colbegin++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
}
