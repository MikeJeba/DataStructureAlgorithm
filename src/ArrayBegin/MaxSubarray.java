package ArrayBegin;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int min = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            min += nums[i];
            if(min < nums[i]){
               min = nums[i];
            }
            if(max < min){
                max = min;
            }
        }
        return max;
    }
}
