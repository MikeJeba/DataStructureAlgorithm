package ArrayBegin;

import java.util.*;
public class AddArray {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> res = addToArrayForm(num,k);
        System.out.print(res);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int carry = k;
        int i = num.length - 1;
        while(i >= 0 || carry > 0){
            if(i >= 0){
                carry += num[i];
                i--;
            }
            result.add(carry % 10);
            carry /= 10;
        }
        Collections.reverse(result);
        return result;
    }
}
