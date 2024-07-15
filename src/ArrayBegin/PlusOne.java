package ArrayBegin;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,9};
        int[] res = plusOne(digits);
        System.out.println(Arrays.toString(res));
    }
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = new int[len + 1];
        temp[0] = 1;
        return temp;
    }
}
