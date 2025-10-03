package CommonIntermediate;

public class Average {
    public static void main(String[] args) {

        int[] n = {1,2,3};
        int len = n.length;
        int res = 0;
        int ans = 1;
        for (int j : n) {
            res += j;
            ans = res / len;
        }
        System.out.println(ans);
    }
}
