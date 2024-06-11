package Intermediate;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int digit = sc.nextInt();
        int sum = 0;
        while(digit > 0){
            int i = digit % 10;
            sum += i;
            digit /= 10;
        }
        System.out.print(sum);
    }
}
