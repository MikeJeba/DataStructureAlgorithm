package MathBasic;

public class Armstrong {
    public static void main(String[] args) {
        int num = 372;
        boolean ans = armstrongNumber(num);
        System.out.println(ans);
    }

    static boolean armstrongNumber(int n) {
        // code here
        int N = n;
        int temp = 0;
        double ans = 0;
        while(n != 0){
            temp = n % 10;
            double store = (double) Math.pow(temp,3);
            ans += store;
            n = n / 10;
        }
        if(ans == N){
            return true;
        }
        return false;
    }
}
