package CommonIntermediate;

import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int unit = sc.nextInt();
        int res;
        if(unit <= 100){
            res = 100 * 10;
        } else if (unit <= 200) {
            res = (100 * 10) + ((unit - 100) * 15)  ;
        } else if(unit <= 300){
            res = (100 * 10) + (100 * 15) + ((unit -200) * 20);
        } else{
            res = (100 * 10) + (100 * 15) + (100 * 20) + ((unit - 300) * 25);
        }
        System.out.println(res);
    }
}
