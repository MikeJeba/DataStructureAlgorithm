package CommonIntermediate;
import java.util.Scanner;
public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hits: ");
        int hit = sc.nextInt();
        System.out.println("Enter the at-bat");
        int at_bat = sc.nextInt();
        if(at_bat == 0){
            System.out.println("No ball one is at bat");
        }
        else{
            int res = hit / at_bat;
            System.out.println(res);
        }
    }
}
