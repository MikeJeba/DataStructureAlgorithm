package ArrayMedium;

import java.util.Arrays;

public class sortColors {

    public static void sortColors(int[] nums) {
       int start = 0;
       int mid = 0;
       int end = nums.length - 1;

       while(mid <= end){

           switch(nums[mid]){
               case 0:
                   swap(nums, start, mid);
                   mid++;
                   start++;
                   break;

               case 1:
                   mid++;
                   break;

               case 2:
                   swap(nums, mid, end);
                   end--;
                   break;
           }
       }
    }

    private static void swap(int[] nums, int pos1, int pos2){
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
