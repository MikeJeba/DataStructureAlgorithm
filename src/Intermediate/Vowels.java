package Intermediate;
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        char val = sc.next().charAt(1);
        if(val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
