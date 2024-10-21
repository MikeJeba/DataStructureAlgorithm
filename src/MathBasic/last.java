package MathBasic;
import java.io.*;
import java.math.*;
import java.util.*;


public class last {

        public static void main(String args[]) throws IOException {
            BufferedReader read =
                    new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                String S[] = read.readLine().split(" ");

                String a = S[0];
                String b = S[1];

                Solution ob = new Solution();
                System.out.println(ob.getLastDigit(a,b));
            }
        }
    }
// } Driver Code Ends

    class Solution {
        static int getLastDigit(String a, String b) {

            if (a.length() == 1 && a.charAt(0) == '0') {
                return 0;
            }

            if (b.length() == 1 && b.charAt(0) == '0') {
                return 1;
            }

            int numa = a.charAt(a.length() - 1) - '0';
            int numb = 0;

            for (int i = 0; i < b.length(); i++) {
                numb = numb * 10 + (b.charAt(i) - '0');
                numb = numb % 4;
            }

            if (numb == 0) {
                numb = 4;
            }

            int res = (int) Math.pow(numa, numb);
            res %= 10;
            return res;
        }
    };
