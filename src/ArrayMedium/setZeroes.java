package ArrayMedium;

import java.util.Arrays;

public class setZeroes {
    public static void setZeroes(int[][] matrix) {
        int col[] = new int[matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            int flag = 0;
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    flag = 1;
                    col[j] = 1;
                }
            }
            if(flag == 1){
                Arrays.fill(matrix[i], 0);
            }
        }

        for(int j = 0; j < col.length; j++){
            if(col[j] == 1){
                for(int i = 0; i < matrix.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
}
