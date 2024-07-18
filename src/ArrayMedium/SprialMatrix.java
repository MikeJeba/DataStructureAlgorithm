package ArrayMedium;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(mat));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> mat = new ArrayList<>();
       int rowbegin = 0;
       int colbegin = 0;
       int rowend = matrix.length - 1;
       int colend = matrix[rowbegin].length - 1;
       while(colbegin <= colend && rowbegin <= rowend) {
           //traverse right
           for (int j = colbegin; j <= colend; j++) {
               mat.add(matrix[rowbegin][j]);
           }
           rowbegin++;
           //traverse down
           for (int k = rowbegin; k <= rowend; k++) {
               mat.add(matrix[k][colend]);
           }
           colend--;

           if(rowbegin <= rowend) {
               //traverse left
               for (int l = colend; l >= colbegin; l--) {
                   mat.add(matrix[rowend][l]);
               }
           }
           rowend--;
           //traverse up
           if(colbegin <= colend) {
               for (int i = rowend; i >= rowbegin; i--) {
                   mat.add(matrix[i][colbegin]);
               }
           }
           colbegin++;
       }
        return mat;
    }
}
