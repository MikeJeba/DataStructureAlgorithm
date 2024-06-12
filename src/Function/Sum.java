package Function;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print(sum(num1,num2));
    }
    static int sum(int num1, int num2){
        return num1 + num2;
    }
}
