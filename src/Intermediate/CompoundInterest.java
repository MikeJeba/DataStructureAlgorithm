package Intermediate;
import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double prince = sc.nextDouble();
        System.out.print("Enter the rate: ");
        double totalRate = sc.nextDouble();
        double rate = totalRate / 100;
        System.out.print("Enter the compound per year: ");
        double comp = sc.nextDouble();
        System.out.print("Enter the year: ");
        double time = sc.nextDouble();
        double res = prince * Math.pow(1 + (rate / comp), comp * time);
        System.out.println(res);
    }
}
