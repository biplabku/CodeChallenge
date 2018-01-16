import java.util.*;

public class sortDuplicateDesc {

    public int[] array = new int[]{2,2,3,4,5,5,6,6,6,7,7,7};

    public void sortThem() {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
            if(!hmap.containsKey(array[i])) {
                hmap.put(array[i], 1);
            }else {
                hmap.put(array[i], hmap.get(array[i]) + 1);
            }
        }

    }

    public void display() {
        for(int  i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        sortDuplicateDesc ss = new sortDuplicateDesc();
        ss.sortThem();
    }
}
