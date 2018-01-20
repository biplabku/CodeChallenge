import java.util.ArrayList;

public class SlidingWindowMaximum {
    // Given an array nums, there is a sliding window of size k which is moving from the very left of the
    // array to the very right. You can only see the k numbers in the window. Each time the sliding
    // window moves right by one position.

    public ArrayList<Integer> findMax(int[] array, int num) {
        ArrayList<Integer> list = new ArrayList<>();


        return list;
    }

    public static void main(String[] args) {
        SlidingWindowMaximum ss = new SlidingWindowMaximum();
        int[] array = new int[] {1,3,-1,-3,5,3,6,7};
        int pos = 3;
        System.out.println(ss.findMax(array, pos));
    }
}
