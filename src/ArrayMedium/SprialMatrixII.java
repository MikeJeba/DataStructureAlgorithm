package ArrayMedium;

import java.util.Arrays;

public class SprialMatrixII {
    public static void main(String[] args) {
        int rows = 1;
        int cols = 4;
        int rStart = 0;
        int cStart = 0;
        System.out.println(Arrays.deepToString(spiralMatrixII(rows,cols,rStart,cStart)));
    }
    public static int[][] spiralMatrixII(int rows, int cols, int rStart, int cStart) {
        int d = 0;
        int count = 1;
        int step = 0;
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        int[][] result = new int[rows * cols][2];
        result[0] = new int[]{rStart,cStart};

        while(count < rows * cols){
            if(d == 0 || d == 2){
                step++;
            }

            for(int i = 0; i < step; i++){
                rStart += direction[d][0];
                cStart += direction[d][1];
                if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                    result[count++] = new int[]{rStart,cStart};
                }

                if(count == rows * cols){
                    return result;
                }
            }

            d = (d + 1) % 4;
        }
        return result;
    }
}

