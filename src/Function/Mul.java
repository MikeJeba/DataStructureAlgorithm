package Function;
import java.util.Scanner;
public class Mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = mul(num1,num2);
        System.out.print(res);
    }
    static int mul(int num1,int num2){
        return num1 * num2;
    }
}
