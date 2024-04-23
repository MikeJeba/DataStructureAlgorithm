package conditionalsloops;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        double h = sc.nextInt();
        System.out.println("Enter the breadth: ");
        double b = sc.nextInt();
        double half = 0.5;
        double res = half * h * b;
        System.out.println(res);
    }
}
