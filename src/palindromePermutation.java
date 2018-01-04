import java.util.HashMap;

public class palindromePermutation {

    // Given a string, wrtite a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that
    // is the same forwards or backwards.  A permutation is a rearrangemenr of letters.

    public boolean isPalindromePermutation(String str) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < str.length(); i++) {
            if(!hmap.containsKey(str.charAt(i)) && str.charAt(i) != ' ' ) {
                hmap.put(str.charAt(i), 1);
            }else if(str.charAt(i) == ' '){

            }else {
                hmap.put(str.charAt(i), hmap.get(str.charAt(i)) + 1);
            }
        }
        boolean iscountflagOdd = false;
        for(int i =0; i < hmap.size(); i++) {
            if(hmap.get(str.charAt(i)) % 2 == 1) {
                if(iscountflagOdd) {
                    return false;
                }
                iscountflagOdd = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        palindromePermutation pp = new palindromePermutation();
        String str = "taco act";
        System.out.println(pp.isPalindromePermutation(str));
    }
}
