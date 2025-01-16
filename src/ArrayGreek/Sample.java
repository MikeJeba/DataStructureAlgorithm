package ArrayGreek;

import java.util.Arrays;

public class Sample {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;
        for(int i = 1; i < n; i++){
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        for(int j = n - 2; j >= 0; j--){
            suff[j] = suff[j + 1] * nums[j + 1];
        }

        int[] ans = new int[n];
        for(int k = 0; k < n; k++){
            ans[k] = pre[k] * suff[k];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
