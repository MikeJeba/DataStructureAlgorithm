package ArrayBegin;

public class Pangram {
    public static void main(String[] args) {
        String sent = "thequickbrownfoxjumpsoverthelazy";
        boolean res = checkIfPangram(sent);
        System.out.println(res);
    }
    public static boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        int count = 0;

        for(int i=0;i<sentence.length();i++) {
            if(arr[sentence.charAt(i)-'a'] == 0) {
                arr[sentence.charAt(i)-'a'] +=1;
                count++;
            }
            if (count == 26) {
                return true;
            }
        }
        return false;
    }
}
