import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class superReducedString {

    public static String findReduced(String str) {
        if(str.length() < 1) {
            return "Empty String";
        }
        if(str.length() == 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;

        // example abc
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }else {
                if(count % 2 == 1) {
                    sb.append(str.charAt(i));
                }
                count = 1;
            }
        }
        if(count % 2 == 1) {
            sb.append(str.charAt(str.length() - 1));
        }
        if(sb.length() < 1) {
            return "Empty String";
        }
        return sb.toString();
    }


    public static String findReduceString(String str) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            if(!hmap.containsKey(str.charAt(i))) {
                hmap.put(str.charAt(i) , 1);
            }else {
                hmap.put(str.charAt(i), hmap.get(str.charAt(i)) + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = hmap.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry entr = (Map.Entry)it.next();
            int val = (Integer) entr.getValue();
            if(val % 2 == 1) {
                sb.append(entr.getKey());
            }
        }
        if(sb.length() < 1) {
            return "Empty String";
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "acdqglrfkqyuqfjkxyqvnrtysfrzrmzlygfveulqfpdbhlqdqrrqdqlhbdpfqluevfgylzmrzrfsytrnvqyxkjfquyqkfrlacdqj";
        System.out.println(findReduceString(str));
    }
}
