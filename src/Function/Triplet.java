package Function;

public class Triplet {
    public static void main(String[] args) {
        int[] arr = {3,4,7};
        int len = arr.length;
        boolean res = triplet(arr,len);
        System.out.println(res);
    }
    static boolean triplet(int[] arr,int len){
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                for(int k = j+1; k < len; k++){
                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];
                    if(x == y + z || y == x + z || z == x + y){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
