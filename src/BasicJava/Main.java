package BasicJava;
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
       int rows, cols;
       Scanner sc = new Scanner(System.in);
       rows = sc.nextInt();
       cols = sc.nextInt();
       sc.close();
       swastika(rows,cols);
    }
    static void swastika(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                if (i < rows / 2){
                    if (j < cols / 2){
                        if (j == 0)
                            System.out.print("*");
                        else
                            System.out.print(" "+ " ");
                    }
                    else if (j == cols / 2)
                        System.out.print("*");
                    else{
                        if (i == 0)
                            System.out.print("*");
                    }
                }
                else if (i == rows / 2)
                    System.out.print("*");
                else{
                    if (j == cols / 2 || j == cols - 1)
                        System.out.print("*");
                    else if (i == rows - 1){
                        if (j <= cols / 2 || j == cols - 1)
                            System.out.print("*");
                        else
                            System.out.print(" "+ " ");
                    }
                    else
                        System.out.print(" "+" ");
                }
            }
            System.out.print("\n");
        }
    }
}