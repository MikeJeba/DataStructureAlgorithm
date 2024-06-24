package ArrayBegin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] res = createTargetArray(nums,index);
        System.out.println(Arrays.toString(res));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetlist = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            targetlist.add(index[i],nums[i]);
        }
        int[] target = new int[targetlist.size()];
        for(int i = 0; i < targetlist.size(); i++){
            target[i] = targetlist.get(i);
        }
        return target;
    }
}
