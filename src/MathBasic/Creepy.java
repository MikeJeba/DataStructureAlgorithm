package MathBasic;

public class Creepy {
    public static int reverseExponentiation(int n) {
        // code here
      int N = n;
      int orgnum = n;
      int res = 1;
      while(N > 0){
          int ld = N % 10;
          if(ld != 0)
              for(int i = 0; i < ld; i++){
                  res = res * orgnum;
              }
          N /= 10;
      }
      return res;
    }

    public static void main(String[] args){
        System.out.print(reverseExponentiation(3));
    }
}
