package ArrayGreek;

public class ArraySearch {
    static int search(int arr[], int x) {

        // Your code here
        int len = arr.length;
        int res = 0;
        for(int i = 0; i < len; i++){
            if(x == arr[i]){
                res = i;
                return res;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int x = 3;
        System.out.print(search(arr,x));
    }
}
