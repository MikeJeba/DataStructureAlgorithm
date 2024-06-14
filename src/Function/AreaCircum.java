package Function;
import java.util.Scanner;
public class AreaCircum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();
        System.out.print(area(radius));
    }
    static int area(int num){
        double area = Math.PI * (num * num);
        double circum = 2 * Math.PI * num;
        System.out.println("Area of circle: " + area);
        System.out.print("Circumference of a circle: " + circum);
        return num;
    }
}
