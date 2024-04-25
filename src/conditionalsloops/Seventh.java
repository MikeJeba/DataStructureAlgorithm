package conditionalsloops;
import java.util.Scanner;
public class Seventh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = Math.sqrt(3);
        double b = a/4;
        System.out.print("Enter the value: ");
        double c = in.nextInt();
        double d = c * c;
        double e = b * d;
        System.out.println(e);
    }
}
