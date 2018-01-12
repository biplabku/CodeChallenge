import java.util.ArrayList;

public class permString {


    // print all the possible orderinhs of the characters in a string
    public boolean[] used;
    public StringBuilder sb = new StringBuilder();
    public String in;

    public permString(String str) {
        in = str;
        used = new boolean[str.length()];
    }



    public void findPermutation() {
        if(sb.length() == in.length()) {
            System.out.println(sb);
            return;
        }

        for(int  i = 0; i < in.length(); i++) {
            if(used[i]) {
                continue;
            }
            sb.append(in.charAt(i));
            used[i] = true;
            findPermutation();
            used[i] = false;
            sb.setLength(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        permString list = new permString();

        String str = "ABCDE";
    }
}
