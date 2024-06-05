package conditionalsloops;
import java.util.Scanner;
public class Large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n;
        int large = Integer.MIN_VALUE;
        while(true){
            n = sc.nextInt();
            if(n == 0){
                break;
            } if(n > large){
                large = n;
            }
        }
            System.out.println("Result: " + large);

    }
}
