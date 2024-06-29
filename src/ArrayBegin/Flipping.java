package ArrayBegin;

import java.util.Arrays;

public class Flipping {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] res = flipAndInvertImage(image);
        System.out.print(Arrays.deepToString(res));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int sam = (n + 1)/2;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < sam; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n - 1 - j] ^ 1;
                image[i][n - 1 - j] = temp;
            }
        }
        return image;
    }
}
