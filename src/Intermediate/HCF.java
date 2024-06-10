package Intermediate;
public class HCF {
    public static void main(String[] args) {
        int res = hcf(10,5);
        System.out.println(res);
    }
    static int hcf(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
