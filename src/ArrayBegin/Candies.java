package ArrayBegin;

import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int eC = 3;
        List<Boolean> res = new ArrayList<>(kidsWithCandies(candies,eC));
        System.out.println(res);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> res = new ArrayList<>();
       int n = candies.length;
       int maxi = Integer.MIN_VALUE;
       for(int i = 0; i < n; i++){
           if(candies[i] > maxi){
               maxi = candies[i];
           }
       }
       for(int i = 0; i < n; i++){
           if(candies[i] + extraCandies >= maxi){
               res.add(i,true);
           }else{
               res.add(i,false);
           }
       }
       return res;
    }
}
