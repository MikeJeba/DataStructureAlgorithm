package Function;
public class primeTwo {
    public static void main(String[] args) {
        int res = prime(1,10);
        System.out.print(res);
    }
    static int prime(int start, int end){
        int flag;
        for(int i = start; i < end; i++){
           if(i == 1 || i == 0) {
               continue;
           }
               flag = 1;

               for(int j = 2; j <= i / 2; ++j){
                   if(i % j == 0){
                       flag = 0;
                       break;
                   }
               }
               if(flag == 1){
                   System.out.print(i + " ");
               }
        }
        return 1;
    }
}
