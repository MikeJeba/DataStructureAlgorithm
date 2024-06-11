package Intermediate;
public class LCM {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int res = lcmresult(a,b);
        System.out.print(res);
    }
    static int lcm(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int lcmresult(int a, int b){
        return Math.abs(a * b) / lcm(a,b);
    }
}
