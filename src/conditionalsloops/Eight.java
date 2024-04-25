package conditionalsloops;
import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter the area: ");
        double a = in.nextInt();
        double area = 2 * pi * a;
        System.out.println(area);
    }
}
