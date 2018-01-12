public class decompressString {

    // Given a compressed string in which a number followed by []
    // indicate how many times those characters occur, decompress the string
    // Given a tree representation of a html parsed output, wherein every block is a node
    // in the tree, find if two html docs contain the same text.
    public decompressString() {

    }

    public String doDecompressMethod1(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i = i + 2) {
            int count = Character.getNumericValue(str.charAt(i + 1));
            for(int j = 0; j < count; j++) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public String deDecompressMethod2(String str) {
        StringBuilder sb = new StringBuilder();

    }


    public static void main(String[] args) {
        decompressString ds = new decompressString();
        String str = "a2b1c2d5";
        System.out.println(ds.doDecompressMethod1(str) );
    }

}
