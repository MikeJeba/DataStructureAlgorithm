package Intermediate;
import java.util.Scanner;
public class SumNPEO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // enter both positive negative odd and even numbers
        System.out.print("Enter: ");
        int num;
        int sumpe = 0;
        int sumn = 0;
        int sumpo = 0;
        do{
            num = sc.nextInt();
            if(num < 0){
                sumn += num;
            }
            else {
                if (num % 2 == 0) {
                    sumpe += num;
                } else{
                    sumpo += num;
                }
            }
        }while(num != 0);
        System.out.println("Positive Even: " + sumpe);
        System.out.println("Positive Odd: " + sumpo);
        System.out.println("Negative: " + sumn);
    }
}
