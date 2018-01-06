public class stringCompression {

    public stringCompression() {

    }


    public String compressString(String str) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        if(str.length() < 2) {
            return str;
        }
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1) == str.charAt(i)) {
                count++;
            }else {
                sb.append(str.charAt(i-1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() -1));
        sb.append(count);
        if(sb.length() > str.length()) {

            return str;
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
        stringCompression ss = new stringCompression();
        String str = "aaabaa";
        System.out.println(ss.compressString(str));
    }
}
