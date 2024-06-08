package Intermediate;
public class Calculate_Distance_Between_points {
    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 5;
        int y1 = 10;
        int y2 = 5;
        double res = Calculate_distance(x1,x2,y1,y2);
        System.out.println(res);
    }
    static double Calculate_distance(double x1,double x2,double y1,double y2){
        return Math.sqrt(Math.pow(x1 - x2 , 2) + Math.pow(y1 - y2 , 2));
    }
}
