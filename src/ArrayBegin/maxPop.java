package ArrayBegin;
public class maxPop {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
        int n = maximumPopulation(logs);
        System.out.println(n);
    }

    public static int maximumPopulation(int[][] logs) {
       int[] population = new int[101];
       for(int[] log : logs) {
           int birth = log[0] - 1950;
           int death = log[1] - 1950;
           population[birth]++;
           if (death < 101) {
               population[death]--;
           }
       }

       int maxPopulation = 0;
       int year = 1950;
       int currentPopulation = 0;
       for(int i = 0; i < 101; i++){
           currentPopulation += population[i];
           if(currentPopulation > maxPopulation){
               maxPopulation = currentPopulation;
               year = 1950 + i;
           }
       }
        return year;
    }
}
