package CommonIntermediate;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element: ");
        int a = sc.nextInt();
        System.out.println("Enter the power: ");
        int b = sc.nextInt();
        double ans = powerFunc(a,b);
        System.out.println(ans);
    }
    static double powerFunc(int a,int b){
        return Math.pow(a,b);
    }
}
