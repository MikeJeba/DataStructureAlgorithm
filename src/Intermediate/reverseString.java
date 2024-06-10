package Intermediate;
import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String value = sc.nextLine();
        String emp = "";
        char ch;
        for(int i = 0; i < value.length(); i++){
            ch = value.charAt(i);
            emp = ch + emp;
        }
       System.out.println(emp);
    }
}
