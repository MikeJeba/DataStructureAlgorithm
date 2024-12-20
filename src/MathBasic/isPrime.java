package MathBasic;

public class isPrime {
    public static void main(String[] args) {
        boolean prime = isPrime(25);
        System.out.println(prime);
    }
     static boolean isPrime(int n){
        int temp = 0;
        if(n <= 1){
            return false;
        }
            for (int i = 2; i < n; i++) {
                temp = n % i;
                if (temp == 0) {
                    return false;
                }
            }
        return true;
     }
}
