package ArrayGreek;

import java.util.Arrays;

public class Sample {

    public static int[] searchRange(int[] nums, int target) {
        int first = position(nums, target, true);
        int last = position(nums, target, false);
        return new int[] {first, last};
    }

    private static int position(int[] nums, int target, boolean test){
        int left = 0;
        int right = nums.length - 1;
        int pos = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                pos = mid;
                if (test) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}
