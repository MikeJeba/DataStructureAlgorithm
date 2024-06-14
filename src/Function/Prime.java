package Function;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        isPrime(num);
    }
    static void isPrime(int num){
        if(num <= 1){
            System.out.print("Is not a prime number.");
        }
        for(int i = 2; i < num; i++ ){
            if(num % i == 0) {
                System.out.print("Is not a prime number.");
            }
        }
        System.out.print("Is a prime number.");
    }
}
