package ArrayBegin;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] temp = new int[2];
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                if(nums[i] + nums[j] == target){
                    temp[0] = i;
                    temp[1] = j;
                }
            }
        }
        return temp;
    }
}
