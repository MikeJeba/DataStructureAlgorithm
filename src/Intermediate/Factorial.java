package Intermediate;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int res = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
        }
        System.out.println(res);
    }
}
