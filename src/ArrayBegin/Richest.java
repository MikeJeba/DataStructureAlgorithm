package ArrayBegin;

public class Richest {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{3,2,1}};
        int res = maximumWealth(nums);
    }
    public static int maximumWealth(int[][] accounts) {
       int sum = 0;
       for(int i = 0; i < accounts.length; i++){
           int temp = 0;
           for(int j = 0; j < accounts[i].length; j++){
              temp += accounts[i][j];
           }
           sum = Math.max(sum,temp);
       }
       return sum;
    }
}
