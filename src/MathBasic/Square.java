package MathBasic;

public class Square {
  static int floorSqrt(int n) {
        // Your code here
    int res = 1;
    while(res * res <= n){
        res++;
    }
          return res - 1;
    }

    public static void main(String[] args) {
        int res = floorSqrt(1);
        System.out.println(res);
    }
}
