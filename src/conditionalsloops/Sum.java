package conditionalsloops;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int input;

            System.out.println("Enter integers (enter 0 to stop):");
            do {
                input = scanner.nextInt();
                sum += input;
            } while (input != 0);

            System.out.println("Sum of entered integers: " + sum);
        }
    }

