package Intermediate;
import java.util.Scanner;
public class npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Enter the r: ");
        int r = sc.nextInt();
        int sub = n - r;
        int mul1 = 1;
        int mul2 = 1;
        int mul3 = 1;
        for(int i = 1; i <= n; i++){
            mul1 *= i;
        }
        for(int j = 1; j <= sub; j++){
            mul2 *= j;
        }
        int res = mul1 / mul2;
        System.out.println("npr: " + res);
        for(int k = 1; k <= r; k++){
            mul3 *= k;
        }
        int res2 = mul1 / (mul3 * mul2);
        System.out.println("ncr: " + res2);
    }
}
