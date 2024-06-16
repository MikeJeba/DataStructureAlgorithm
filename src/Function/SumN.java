package Function;
import java.util.Scanner;
public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        int res = sum(num);
        System.out.println(res);
    }
    static int sum(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }
}
