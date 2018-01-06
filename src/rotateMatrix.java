public class rotateMatrix {

    public rotateMatrix() {

    }



    public boolean doRotate(int[][] arr) {

        if(arr.length == 0 || arr.length != arr[0].length) {
            return false;
        }
        int len = arr.length;

        for(int i = 0; i < len/2; i++) {
            int first = i;
            int last = len - 1 - i;
            for(int j = first; j < last; j++) {
                int offset = j - first;
                int top = arr[first][j];
                //left -- top
                arr[first][j] = arr[last - offset][first];
                // top - right
                arr[j][last] = arr[first][j] ;
                // bottom - right
                arr[last - offset][last] = top ;
                // bottom - left
                arr[last - offset][first] = arr[last - offset][last] ;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        rotateMatrix rr = new rotateMatrix();

    }
}
