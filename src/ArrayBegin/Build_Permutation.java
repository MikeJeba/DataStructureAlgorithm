package ArrayBegin;

public class Build_Permutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] res = buildArray(nums);
    }
    public static int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
            System.out.println(ans[i]);
        }
        return ans;
    }
}
