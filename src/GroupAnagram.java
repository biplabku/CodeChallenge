import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagram {
    // meaning of anagrams - words from the same letters
    // so the number of times each letter is repeated can be termed as anagrams
    // comparing 2 strings and then adding them to the array list

    public static ArrayList<String> groupAnagrams(String[] array) {
        ArrayList<String> result = new ArrayList<>();
        // Complexity of the code in this case is O(n2)
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(isAnagram(array[i], array[j])){
                    result.add("[" + array[i] + " , "+ array[j] + "]");
                }
            }
        }
        return result;
    }

    public static boolean isAnagram(String str, String inpt) {
        char[] ch1 = str.toCharArray();
        char[] ch2 = inpt.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String st1 = String.valueOf(ch1);
        String st2 = String.valueOf(ch2);
        if(st1.equals(st2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] str_input = {"cat", "act", "bat", "ctb", "taba"};
        //System.out.println(isAnagram("cat","tac"));
        System.out.println(groupAnagrams(str_input));
    }
}
