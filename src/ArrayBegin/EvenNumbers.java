package ArrayBegin;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int res = findNumbers(nums);
        System.out.println(res);
    }
    public static int findNumbers(int[] nums) {
        int n = nums.length;
        int samp = 0;
        for(int i = 0 ; i < n; i++) {
            int count = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                count++;
            }
                if (count % 2 == 0) {
                    samp++;
                }
        }
        return samp;
    }
}
