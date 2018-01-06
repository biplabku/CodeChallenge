public class isSubstring {

    public isSubstring() {

    }

    public boolean isSubstring(String str, String test) {
        str = str + str;
        System.out.println(str);
        for(int i =0; i < (str.length() - test.length()); i++) {
            if(test.equals(str.substring(i, i + test.length()))) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        isSubstring sb = new isSubstring();
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println(sb.isSubstring(str1, str2));
    }
}
