import java.util.HashSet;

public class isUnique {

    // Write a code to check if a string has all the unique characters

    public boolean isUnique(String str) {
        if(str == "") {
            return false;
        }
        HashSet<Character> hs = new HashSet<>();
        for(int  i = 0; i < str.length(); i++) {
            if(!hs.contains(str.charAt(i))) {
                hs.add(str.charAt(i));
            }else {
                return false;
            }
        }
        return true;
    }

    public boolean isUniqueMethod2(String str) {
        if(str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        isUnique ss = new isUnique();
        String str = "fd";
        System.out.println(ss.isUnique(str));
        System.out.println(ss.isUnique(str));
    }
}
