package ArrayGreek;

//https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}


public class Minmax {

    public static Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int len = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //for loop for finding the greatest number
        for(int i = 0; i < len; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

        return new Pair<>(max,min);
    }

    public static void main(String[] args) {
       int[] arr = {3, 2, 1, 56, 10000, 167};
       getMinMax(arr);
    }
}
