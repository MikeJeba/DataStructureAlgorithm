package ArrayGreek;

public class thirdlargest {
    static int thirdLargest(int arr[]) {
        // Your code here
        int len = arr.length;
        int num = 0;
        int flar = 0;
        int slar = 0;
        if(len <= 2) {
            return -1;
        }
        for(int i = 0; i < len; i++){
            if(flar < arr[i]) {
                num = slar;
                slar = flar;
                flar = arr[i];
            }
            else if(slar < arr[i]){
                num = slar;
                slar = arr[i];
            }else if(num < arr[i]){
                num = arr[i];
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        System.out.println(thirdLargest(arr));
    }
}
