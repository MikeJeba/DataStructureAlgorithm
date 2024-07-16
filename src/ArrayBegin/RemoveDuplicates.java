package ArrayBegin;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        System.out.print(res);
    }
    public static int removeDuplicates(int[] nums) {
        int rd = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[rd] != nums[i]){
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd + 1;
    }
}
