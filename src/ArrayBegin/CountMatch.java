package ArrayBegin;

import java.util.List;
public class CountMatch {
    public static void main(String[] args) {
        List<List<String>> items = List.of(List.of("phone","blue","pixel"),List.of("computer","silver","lenovo"),List.of("phone","gold","iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        int res = countMatches(items,ruleKey,ruleValue);
        System.out.print(res);
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if(ruleKey.equals("type")){
            index = 0;
        }
        if(ruleKey.equals("color")){
            index = 1;
        }
        if(ruleKey.equals("name")){
            index = 2;
        }
        int count = 0;
        for(List<String> item: items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
