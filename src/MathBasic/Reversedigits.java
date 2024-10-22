package MathBasic;

public class Reversedigits {
    public long reverse_digit(long n)
    {
        int rev = 0;
        // Code here
        while(n>0) {
            int rem = (int) n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args){
        Reversedigits rd = new Reversedigits();
       System.out.println(rd.reverse_digit(200));
    }
}
