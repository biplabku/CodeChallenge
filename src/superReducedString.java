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


    public static void findRed


    public static void main(String[] args) {
        String str = "aabbccabbc";
        System.out.println(findReduced(str));
    }
}
