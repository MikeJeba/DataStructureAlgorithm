package BasicJava;
import java.util.*;
public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            System.out.println("Comparsion: " + str.charAt(left) + " with " + str.charAt(right) );
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Error");
            }
            left++;
            right--;
        }

    }
}
