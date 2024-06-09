package Intermediate;

public class SumNnum {
    public static void main(String[] args) {

        System.out.println("Enter the numbers: ");
        int[] num = {5,6,7,8,9};
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }
        System.out.println(sum);
    }
}
