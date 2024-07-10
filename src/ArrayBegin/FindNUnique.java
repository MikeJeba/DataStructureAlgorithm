package ArrayBegin;

import java.util.Arrays;

public class FindNUnique {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int[] nums = new int[n];
        int d =- n/2;
        if(n%2 != 0) {
            for(int i = 0; i < nums.length; i++) {
                nums[i] = d;
                d += 1;
            }
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(d==0) {
                    d = d + 1;
                }
                    nums[i] = d;
                    d += 1;

            }
        }
        return nums;
    }
}
