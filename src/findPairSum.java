import java.util.ArrayList;
import java.util.HashMap;

public class findPairSum {

    // Design an algorithm to find all pairs of integers within an array which sum to a specified value.
    // Eg, if Array=[12,4,28,2,8,9,3,-16,0] ;Sum=12 . How many pairs? What are they?

    public static ArrayList<String> findSumPairs(int[] array, int sum) {
        // Simplest solution can have 2 loops
        // This will work in O(N2)
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {

                if(sum == array[i] + array[j]) {
                    result.add("[" + array[i] + " , "+ array[j] + "]");
                }
            }
        }
        return result;
    }


    public static ArrayList<String> findSumPairsOptimize(int[] array, int sum) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        ArrayList<String> output = new ArrayList<>();

        // Save only the unrepeated values
        for(int i = 0; i < array.length; i++) {
            if(!hmap.containsValue(array[i])) {
                hmap.put(i, array[i]);
            }
        }
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            result = sum - array[i];
            if(hmap.containsValue(result)) {
                output.add("[" + array[i] + " , "+ result + "]");
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] array = {12,4,28,2,8,9,3,-16,0};
        int sum = 12;
        System.out.println(findSumPairs(array, sum));
        System.out.println(findSumPairsOptimize(array, sum));

    }
}
