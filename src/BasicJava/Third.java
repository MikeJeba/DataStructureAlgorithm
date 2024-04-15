package BasicJava;
import java.util.*;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int p = sc.nextInt();
        System.out.print("Enter the time required: ");
        int t = sc.nextInt();
        System.out.print("Enter the Rate: ");
        int r = sc.nextInt();
        int a = (p * t * r)/100;
        System.out.println(a);
    }
}
