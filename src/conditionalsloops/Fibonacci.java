package conditionalsloops;

public class Fibonacci {
    public static void main(String[] args){
        int count = 2;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        while(count <= 5){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            count++;
        }
    }
}
