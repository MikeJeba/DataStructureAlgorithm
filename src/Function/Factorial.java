package Function;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Factorial(num);
    }

    static void Factorial(int num) {
        int mul = 1;
        if(num == 0){
            mul = 0;
        }
        for (int i = 1; i <= num; i++) {
            mul = mul * i;
        }
        System.out.println(mul);
    }
}
