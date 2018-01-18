import java.util.Stack;

public class CountAndSay {



    public String findShortSequenceMethod1(int number) {
        String str = String.valueOf(number);
        str = findShortSequenceMethod2(str);
        return str;
    }

    public String findShortSequenceMethod2(String str) {
        StringBuilder sb = new StringBuilder();
        if(str.length() < 1) {
            return null;
        }else if(str.length() == 1) {
             sb.append(str.charAt(0));
             sb.append(1);
             return sb.toString();
        }

        int count = 1;
        sb.append(str.charAt(0));

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i - 1)  == str.charAt(i )) {
                count++;
            }else {
                sb.append(count);
                sb.append(str.charAt(i));
                count = 1;
            }
        }
        if(count > 1) {
            sb.append(count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CountAndSay cs = new CountAndSay();
        String str = "11223133";
        int number = 11223133;
        System.out.println(cs.findShortSequenceMethod2(str));
        System.out.println(cs.findShortSequenceMethod1(number));
    }
}
