package CommonIntermediate;
import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        int[] marks = new int[5];
        int len = marks.length;
        for(int j = 0; j < len; j++){
            marks[j] = sc.nextInt();
        }
        int sum = 0;
        int res = 0;
        for(int i = 0 ; i < len; i++) {
             sum += marks[i];
             res = sum / len;
        }
        System.out.println(res);
    }
}
