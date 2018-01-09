import java.util.HashMap;

public class checkRepeat {
    //Given a contiguous sequence of numbers in which each number repeats thrice, there is exactly one missing number. Find the missing number.
    // eg: 11122333 : Missing number 2
    //        11122233344455666 Missing number 5

    public int findMissingNum(int[] str,int counter) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        if(str.length < 1) {
            return -1;
        }
        for(int i = 0; i < str.length; i++) {
            if(!hmap.containsKey(str[i])) {
                hmap.put(str[i], 1);
            }else {
                hmap.put(str[i], hmap.get(str[i]) + 1);
            }
        }
        for(int i = 0; i < str.length; i++) {
            if(hmap.get(str[i]) != counter) {
                return str[i];
            }
        }
        return -1;
    }

    public int findMissingNum1(int[] str, int counter) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        if(str.length < 1) {
            return -1;
        }
        int count = 1;
        for(int i = 0; i < str.length-1; i++) {
            if(str[i] == str[i + 1]) {
                count++;
            }else {
                    if(count != counter) {
                        return str[i];
                    }
                    count = 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] str = new int[] {1};
        checkRepeat cc = new checkRepeat();
        System.out.println(cc.findMissingNum(str, 3));

    }
}
