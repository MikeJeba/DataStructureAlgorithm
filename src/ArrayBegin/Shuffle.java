package ArrayBegin;

public class Shuffle {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] res = shuffle(nums,n);
        System.out.println(java.util.Arrays.toString(res));
    }
    public static int[] shuffle(int[] nums, int n) {
        int len = 2 * n;
        int[] res = new int[len];
        for(int i = 0; i < n; i++){
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i + n];
        }
        return res;
    }
}
