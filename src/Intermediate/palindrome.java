package Intermediate;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(n > 0){
            int j = n % 10;
            sum = (sum * 10) + j;
            n /= 10;
        }
        if(temp == sum){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
}
