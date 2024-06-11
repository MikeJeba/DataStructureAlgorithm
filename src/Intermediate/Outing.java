package Intermediate;
public class Outing {
    public static void main(String[] args) {
        int month = 31;
        int sum = 0;
        for(int i = 1; i <= month; i++){
            if(i % 2 == 0){
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
