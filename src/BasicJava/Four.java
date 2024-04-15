package BasicJava;
import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res;
        System.out.print("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = sc.nextInt();
        System.out.print("Choose the operator(+,-,*,/): ");
        char op = sc.next().charAt(0);
        if(op == '+'){
            res = num1 + num2;
        }
        else if(op == '-'){
            res = num1 - num2;
        }
        else if(op == '*'){
            res = num1 * num2;
        }
        else{
            res = num1 / num2;
        }
        System.out.println(res);
    }
}
