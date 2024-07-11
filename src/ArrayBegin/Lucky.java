package ArrayBegin;

import java.util.ArrayList;
import java.util.List;

public class Lucky {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(matrix));

    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
       ArrayList<Integer> res = new ArrayList<>();
       int n = matrix.length;
       int m = matrix[0].length;
       int[] rowmin = new int[n];
       int[] colmax = new int[m];
       int rowcom = 0;
       int colcom = 0;
       for(int i = 0; i < n; i++){
          rowcom = matrix[i][0];
          for(int j = 1; j < m; j++){
              if(matrix[i][j] < rowcom){
                  rowcom = matrix[i][j];
              }
          }
          rowmin[i] = rowcom;
       }

       for(int j = 0; j < m; j++){
           colcom = matrix[0][j];
           for(int i = 1; i < n; i++){
               if(matrix[i][j] > colcom){
                   colcom = matrix[i][j];
               }
           }
           colmax[j] = colcom;
       }

       for(int i = 0; i < n; i++){
           for(int j = 0; j < m; j++){
               if(rowmin[i] == matrix[i][j] && colmax[j] == matrix[i][j]){
                   res.add(matrix[i][j]);
               }
           }
       }

       return res;
    }
}
