package MathBasic;

public class CountDigits {
    public static void main(String[] args){
        Solution2 ob = new Solution2();
        System.out.println(ob.evenlyDivides(12));
    }
}
class Solution2{
    static int evenlyDivides(int N){
        // code here
        int count  = 0;
        int org = N;
        while(N > 0){
        int temp = N % 10; // to return last number
            N = N / 10;
        int val = org % temp; // to return reminder
        if(val == 0) {
            count++;
        }
        }
        return count;
    }
}
