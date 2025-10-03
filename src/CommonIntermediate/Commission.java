package CommonIntermediate;
import java.util.Scanner;
public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Sale: ");
        double totalSales = sc.nextDouble();
        System.out.println("Enter the Commission: ");
        double commissionRate = sc.nextDouble();
        double ans = CommissionResult(totalSales,commissionRate);
        System.out.println(ans);
    }
    static double CommissionResult(double totalSales, double commissionRate){
        return (totalSales * commissionRate) / 100;
    }


}
