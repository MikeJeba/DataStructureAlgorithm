package ArrayGreek;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> mat = new ArrayList<>();
        int colbegin = 0;
        int rowbegin = 0;
        int rowend = matrix.length - 1;
        int colend = matrix[0].length - 1;
        while(rowbegin <= rowend && colbegin <= colend){
            //transverse right
            for(int i = colbegin; i <= colend; i++){
                mat.add(matrix[rowbegin][i]);
            }
            rowbegin++;

            //transverse down
            for(int j = rowbegin; j <= rowend; j++){
                mat.add(matrix[j][colend]);
            }
            colend--;

            //tranverse lef
            if(rowbegin <= rowend){
                for(int k = colend; k >= colbegin; k--){
                    mat.add(matrix[rowend][k]);
                }
            }
            rowend--;

            if(colbegin <= colend){
                for(int l = rowend; l >= rowbegin; l--){
                    mat.add(matrix[l][colbegin]);
                }
            }
            colbegin++;
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(mat));
    }
}
