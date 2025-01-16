package ArrayMedium;

import java.util.Arrays;

public class Productexpect {

    public static int[] productExceptSelf(int[] nums) {
      int[] res = new int[nums.length];
      for(int i = 0; i < nums.length; i++){
          int prod = 1;
          for(int j = 0; j < nums.length; j++){
              if(i == j) continue;
              prod *= nums[j];
          }
          res[i] = prod;
      }
      return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
