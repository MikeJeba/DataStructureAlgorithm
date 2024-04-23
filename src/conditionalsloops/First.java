package conditionalsloops;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area: ");
        double r = sc.nextDouble();
        double pi = 3.14;
        double res = pi * Math.pow(r,2);
        System.out.println(res);
    }
}
