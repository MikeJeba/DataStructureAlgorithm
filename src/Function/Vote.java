package Function;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int num = sc.nextInt();
        vote(num);
    }
    static void vote(int num){
        if(num >= 18){
            System.out.print("Eligible");
        }
        else{
            System.out.print("Not eligible");
        }
    }
}
