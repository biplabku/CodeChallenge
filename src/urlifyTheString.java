public class urlifyTheString {

    // Write a method to replace all spaces in a string with "%20". you many assume that the string has sufficient
    // space at the end to hold the additional characters and that you are given the true lenght of the string.
    public String urlifytheString(char[] array, int trueLength) {
        String result = "";
        String pattern = "%20";
        int i = 0;
        while(trueLength != 0) {
            if(array[i] != ' ') {
                result = result + array[i];
                trueLength--;
                i++;
            }else {
                result = result + pattern;
                i = i + 1;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        urlifyTheString st = new urlifyTheString();
        String str = "Mr john smith      ";
        char[] array = str.toCharArray();
        System.out.println(array.length);
        System.out.println(st.urlifytheString(array, 11));
    }
}
