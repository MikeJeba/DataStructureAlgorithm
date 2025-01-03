package MathBasic;

public class Perfect {
    static boolean isPerfectNumber(int n) {

        int store = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                store += i;
            }
            if (n / i != n) {
                store += n / i;
            }
        }

        return n == store ? true : false;
    }
        public static void main(String[] args) {
        boolean ans = isPerfectNumber(10);
        System.out.println(ans);
    }
}
