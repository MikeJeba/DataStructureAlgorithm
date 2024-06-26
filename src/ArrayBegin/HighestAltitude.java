package ArrayBegin;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int res = largestAltitude(gain);
        System.out.print(res);
    }
    public static int largestAltitude(int[] gain) {
        int alt = 0;
        int point = 0;
        for (int j : gain) {
            point += j;
            if (point > alt) {
                alt = point;
            }
        }
        return alt;
    }
}
