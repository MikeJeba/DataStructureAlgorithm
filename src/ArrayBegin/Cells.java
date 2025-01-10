package ArrayBegin;

public class Cells {
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int[][] indices = {{1,1},{0,0}};
        int res = oddCells(m,n,indices);
        System.out.print(res);
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] emp = new int[m][n];
        int count = 0;
        for(int[] index: indices) {
            int row = index[0];
            int col = index[1];
            for (int j = 0; j < n; j++) {
                emp[row][j]++;
            }
            for (int i = 0; i < m; i++) {
                emp[i][col]++;
            }
        }

            for(int k = 0; k < m; k++){
                for(int l = 0; l < n; l++){
                    if(emp[k][l] % 2 != 0){
                        count++;
                    }
                }
            }
        return count;
    }
}
