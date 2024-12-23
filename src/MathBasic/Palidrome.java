package MathBasic;

public class Palidrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(1234);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int n) {
        // Code here
        int N = n;
        int temp = 0;
        int store = 0;
        while (n != 0){
            temp = n % 10;
            store = store * 10 + temp;
            n /= 10;
        }
        if(store == N){
            return true;
        }
        return false;
    }
}
