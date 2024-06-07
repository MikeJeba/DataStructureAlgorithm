package Intermediate;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {1,2,3};
        int len = n.length;
        int res = 0;
        int ans = 1;
        for(int i = 0; i < len; i++){
            res += n[i];
            ans = res / len;
        }
        System.out.println(ans);
    }
}
