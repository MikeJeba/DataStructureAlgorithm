package Intermediate;
import java.util.Scanner;
public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the armstrong: ");
        int n = sc.nextInt();
        int sum = 0;
        int assign = n;
        for(int i = 1; i < n; i++){
            int j = assign % 10;
            sum += (int) Math.pow(j,3);
            assign = assign / 10;
        }
        if(sum == n) {
            System.out.println(n);
        }
        else{
            System.out.println("wrong");
        }
    }
}
