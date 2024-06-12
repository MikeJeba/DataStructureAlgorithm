package Function;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = max(num1,num2,num3);
        int min = min(num1,num2,num3);
        System.out.println(max);
        System.out.print(min);
    }
    static int max(int num1, int num2, int num3){
        int max = num1;
        if(max < num2){
            max = num2;
        }
        if(max < num3){
            max = num3;
        }
        return max;
    }
    static int min(int num1, int num2, int num3){
        int min = num1;
        if(min > num2){
            min = num2;
        }
        if(min > num3){
            min = num3;
        }
        return min;
    }
}
