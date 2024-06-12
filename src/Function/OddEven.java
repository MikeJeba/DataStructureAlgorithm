package Function;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        oddeven(num);
    }
    static void oddeven(int num){
        if(num % 2 == 0){
            System.out.println(num + " is a even number.");
        }
        else{
            System.out.println(num + " is odd number.");
        }
    }
}
