package CommonIntermediate;
import java.util.Scanner;
public class FutureValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial amount: ");
        int initial = sc.nextInt();
        System.out.print("Enter the rate: ");
        int rate = sc.nextInt();
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int res1 = 1 + rate;
        int res2 = (int) (initial * Math.pow(res1,n));
        System.out.print(res2);
    }
}
