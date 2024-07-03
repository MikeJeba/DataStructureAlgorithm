package ArrayBegin;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] res = transpose(matrix);
        System.out.println(Arrays.deepToString(res));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                newMatrix[j][i] = temp;
            }
        }
        return newMatrix;
    }
}
