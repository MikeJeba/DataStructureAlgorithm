package BasicJava;

public class Solution {
    public static void main(String[] args) {
        System.out.println(oddEven(2));
    }
    static String oddEven ( int n){
        if (n % 2 == 0) {
            return "even";
        }
        return "odd";
    }
}
