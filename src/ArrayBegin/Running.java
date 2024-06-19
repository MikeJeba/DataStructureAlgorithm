package ArrayBegin;

public class Running {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int[] res = runningSum(nums);
    }
    public static int[] runningSum(int[] nums) {
        int len = nums.length;

        for(int i = 1; i < len; i++){
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
