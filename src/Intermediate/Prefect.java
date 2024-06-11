package Intermediate;
import java.util.Scanner;
public class Prefect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // enter the prime number only
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        double res = Math.pow(2,num) - 1;
        double res2 = res * Math.pow(2,(num - 1));
        System.out.println(res2);
    }
}
