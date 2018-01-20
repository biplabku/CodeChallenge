import java.util.ArrayList;

public class SlidingWindowMaximum {
    // Given an array nums, there is a sliding window of size k which is moving from the very left of the
    // array to the very right. You can only see the k numbers in the window. Each time the sliding
    // window moves right by one position.

    public ArrayList<Integer> findMaxSlidingWindow(int[] array, int num) {
        if(num > array.length ) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < (array.length - num + 1); i++) {
            list.add(findMax(array, i, (i + num)));
        }
        return list;
    }

    public int findMax(int[] array, int index, int j) {
        int max = array[index];
        for(int i = index; i < j; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        SlidingWindowMaximum ss = new SlidingWindowMaximum();
        int[] array = new int[] {1,3,-1,-3,5,3,6,7};
        int pos = 3;
        System.out.println(ss.findMaxSlidingWindow(array, pos));
    }
}
