package ArrayGreek;

import java.util.Arrays;

public class Missing {
   static int missingNumber(int arr[]) {
        // code here
       int len = arr.length + 1;
       int[] freq = new int[len + 1];
       int res = 0;

       for(int i = 0; i < arr.length; i++){
           freq[arr[i]]++;
       }

       for(int i = 0; i <= len; i++){
           if(freq[i] == 0){
               res = i;
           }
       }

       return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(missingNumber(arr));
    }
}
