package MathBasic;

import java.util.*;

public class Divisors {
    public static void main(String[] args) {
        int N = 10;
        System.out.println(printDivisors(N));
    }
    public static List<Integer>  printDivisors(int n) {
        // Write your code here
        List<Integer> store = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            int temp = n % i;
            if(temp == 0)
                store.add(i);
        }
        return store;
    }
}
