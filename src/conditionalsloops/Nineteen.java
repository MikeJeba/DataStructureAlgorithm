package conditionalsloops;
import java.util.Scanner;
public class Nineteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pi = 3.17;
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        System.out.println("Enter the height: ");
        double h = sc.nextDouble();
        double res = 2 * pi * r * h;
        System.out.println("Result " + res);
    }
}
