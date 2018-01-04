import java.util.Arrays;
import java.util.HashMap;

public class checkPermutation {
    // Write a code to check if one string is a permutation of the other?

    public boolean isPermutation(String str1, String str2) {
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        str1 = a.toString().copyValueOf(a);
        Arrays.sort(b);
        str2 = b.toString().copyValueOf(b);
        if(str1.equals(str2)) {
            return true;
        }
        return false;
    }

    public boolean isPermutationMethod2(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i = 0; i < str1.length(); i++) {
            if(!hmap.containsKey(str1.charAt(i))) {
                hmap.put(str1.charAt(i), 1);
            }else {
                hmap.put(str1.charAt(i), hmap.get(str1.charAt(i)) + 1);
            }
        }
        for(int i = 0; i < str1.length(); i++) {
            if(!hmap.containsKey(str2.charAt(i))) {
                return false;
            }else {
                hmap.put(str2.charAt(i), hmap.get(str2.charAt(i)) - 1);
            }
        }
        for(int i = 0; i < str1.length(); i++) {
            if(hmap.get(str1.charAt(i)) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPermutationMethod3(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        int[] letters = new int[128];
        for(int i = 0 ; i< str1.length(); i++) {
            letters[str1.charAt(i)]++;
        }

        for(int  i = 0; i < str1.length(); i++) {
            letters[str2.charAt(i)]--;
            if(letters[str2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        checkPermutation ch = new checkPermutation();
        String str1 = "hkd";
        String str2 = "hka";
        System.out.println(ch.isPermutation(str1, str2));
        System.out.println(ch.isPermutationMethod2(str1, str2));
        System.out.println(ch.isPermutationMethod3(str1, str2));

    }
}
