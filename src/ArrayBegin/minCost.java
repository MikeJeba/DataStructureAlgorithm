package ArrayBegin;

class minCost {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        int res = minCostToMoveChips(position);
        System.out.println(res);
    }
    public static int minCostToMoveChips(int[] position) {
        int e = 0;
        int o = 0;
        for(int i : position){
            if(i % 2 == 0){
                e++;
            }else{
                o++;
            }
        }
        return Math.min(e,o);
    }
}