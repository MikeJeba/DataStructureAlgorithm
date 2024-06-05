package conditionalsloops;
import java.util.Scanner;
public class TwoNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 of choice: ");
        System.out.println("Enter the number2 of choice: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        if(num1 >= 0 && num2 >= 0){
            sum = num1 + num2;
        }
        System.out.println(sum);
    }
}
