package CommonIntermediate;

public class Discount {
    public static void main(String[] args) {
        int m = 50;
        int s = 45;
        int d = m - s;
        float dp = ((float) d / m) * 100;
        System.out.println(dp);
    }
}
