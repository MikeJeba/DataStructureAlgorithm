package ArrayBegin;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat = {{0,0},{0,1}};
        int[][] target = {{1,1},{0,1}};
        boolean res = findRotation(mat,target);
        System.out.print(res);
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
       for(int i = 0; i < 4; i++){
           if(same(mat,target)){
               return true;
           }
           mat = rotate(mat);
       }
        return false;
    }

    private static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] b = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                b[j][n - i - 1] = mat[i][j];
            }
        }
        return b;
    }

    private static boolean same(int[][] mat, int[][] target) {
        if(mat.length == target.length && mat[0].length == target[0].length){
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[0].length; j++){
                    if(mat[i][j] != target[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
