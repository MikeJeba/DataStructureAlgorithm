package CommonIntermediate;

import java.util.Scanner;
public class DepreciationCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial Cost: ");
        int initialCost = sc.nextInt();
        System.out.println("Enter the salvage: ");
        int salvage = sc.nextInt();
        System.out.println("Enter the Useful life: ");
        int usefulLife = sc.nextInt();
        int res = (initialCost - salvage) / usefulLife;
        System.out.println(res);
    }
}
