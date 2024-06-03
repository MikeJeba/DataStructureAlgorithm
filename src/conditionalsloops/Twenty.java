package conditionalsloops;
import java.util.Scanner;
public class Twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area: ");
        int a = sc.nextInt();
        int res = (int) (6 * Math.pow(a , 2));
        System.out.println(res);
    }
}
