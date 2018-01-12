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
        int sum = 0;
        int out = array.length;
        String str = "";
        for(int i  = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                sum = sum + array[j];
                res = res + array[j];
                if(sum == target ) {
                    out = Math.min(out, res.length());
                    break;
                }
            }
            sum = 0;
            res ="";
        }
        return out;
    }

    public static void main(String[] args) {
        minSizeSubSum ms = new minSizeSubSum();
        int[] array = new int[]{2,3,1,2,4,3, 7};
        int target = 7;
        System.out.println(ms.findMinSize2(array, target));

    }
}
