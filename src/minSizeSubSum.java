import java.util.ArrayList;
import java.util.HashSet;

public class minSizeSubSum {
    // Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous
    // subarray of which the sum ≥ s. If there isn't one, return 0 instead.For example, given the array [2,3,1,2,4,3]
    // and s = 7,the subarray [4,3] has the minimal length under the problem constraint.



    public String findMinSize(int[] array,int target ) {
        String res ="";
        HashSet<Integer> hset = new HashSet<>();
        for(int i = 0; i< array.length; i++) {
            int diff  = target - array[i];
            if(!hset.contains(diff)) {
                hset.add(array[i]);
            }else {
                res = res + array[i] +" ,"+ diff;
            }

        }
        return res;
    }


    public int findMinSize2(int[] array, int target) {
        String res = "";
        int out = 0;
        String r = "";
        for(int i  = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(out == target ) {
                    res = r;
                    System.out.println(res + "j");
                }
                out = out + array[j];
                r = r + array[j];
            }
            r = "";
            out = 0;
        }
        return res.length();
    }

    public static void main(String[] args) {
        minSizeSubSum ms = new minSizeSubSum();
        int[] array = new int[]{2,3,1,2,4,3};
        int target = 7;
        System.out.println(ms.findMinSize2(array, target));

    }
}
