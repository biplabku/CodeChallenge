import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class kthFrequentNumber {


    // one way is to sort the elements and then second most repeated values

    public int findKth(int[] array, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {
            if(!hmap.containsKey(array[i])) { // if it doesnot contains key
                hmap.put(array[i], 1);
            }else {
                hmap.put(array[i], hmap.get(array[i]) + 1);
            }
        }
        Iterator it = hmap.entrySet().iterator();
        int key = 0;
        int i = hmap.size() - 1;
        while(i > 0) {
            Map.Entry  p = (Map.Entry)it.next();
            key =(Integer) p.getKey();
            i--;
        }
        return key;
    }

    public static void main(String[] args) {
        kthFrequentNumber kk = new kthFrequentNumber();
        int[] array = new int[]{1,2,3,2,1,2,2,3,3};
        // 1 -- 2
        // 2 -- 4
        // 3 -- 2
        int k = 2;
        System.out.println(kk.findKth(array,  k));
    }
}
