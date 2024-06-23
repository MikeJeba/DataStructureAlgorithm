package ArrayBegin;

import java.util.Arrays;

public class Smaller {
    public static void main(String[] args) {
        int[] test = {8,1,2,2,3};
        int[] res = smallerNumbersThanCurrent(test);
        System.out.print(Arrays.toString(res));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
                int res[] = new int[nums.length];
                int freq[] = new int[101];
                // frequency stored
                for(int i=0;i<nums.length;i++){
                    freq[nums[i]]++;
                }
                //running sum
                for(int i=1;i<101;i++){
                    freq[i] += freq[i-1];
                }
                // store answer
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==0){
                        res[i] =0;
                    }else{
                        res[i] = freq[nums[i]-1];
                    }
                }
                return res;
    }
}
