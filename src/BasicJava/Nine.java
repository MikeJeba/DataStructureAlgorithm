package BasicJava;

public class Nine {
public static void main(String[] args){
    int rem ,res = 0;
    int num = 371;
    int or = num;
    while(or != 0){
         rem = or % 10;
         res += Math.pow(rem,3);
        or /= 10;
    }
    if(res == num){
        System.out.println("Num is armstrong number");
    }
    else{
        System.out.println("Num is not a armstrong number");
    }
}
}

