import static java.lang.Math.abs;

public class oneEditAway {
    public oneEditAway() {

    }

    public boolean oneEditAway(String str1, String str2) {
        if(abs(str1.length() - str2.length()) > 1) {
            return false;
        }
        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while(index1 < str1.length() && index2 < str2.length()) {
            if(str1.charAt(index1) != str2.charAt(index2)) {
                if(foundDifference) {
                    return false;
                }
                foundDifference = true;
            }

            index1++;
            index2++;
        }
        return true;
    }

    public static void main(String[] args ){
        oneEditAway ss = new oneEditAway();
        String str1 = "s";
        String str2 = "p";
        System.out.println(ss.oneEditAway(str1, str2));
    }
}
