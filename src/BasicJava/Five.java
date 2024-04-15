package BasicJava;
import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = sc.nextInt();
        int res = Math.max(num1,num2);
        System.out.print(res);
    }
}
