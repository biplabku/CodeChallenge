public class zeroMatrix {


    public zeroMatrix() {

    }


    public void zeroMatrix(int[][] array) {
        boolean[] row = new boolean[array.length];
        boolean[] column = new boolean[array[0].length];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if(array[i][j] == 0) {
                    row[i] = true;
                    column[i] = true;
                }
            }
        } // O(N2)


        for(int i = 0; i < array.length; i++) {
            if(row[i] == true){
                setZeroRows(array, i);
            }
        }

        for(int i = 0; i < array[0].length; i++) {
            if(column[i] == true){
                setZeroCols(array, i);
            }
        }

    }

    public void setZeroRows(int[][] array, int j){
        for(int i = 0; i < array.length;i++) {
            array[j][i] = 0;
        }
    }

    public void setZeroCols(int[][] array, int j){
        for(int i = 0; i < array.length;i++) {
            array[i][j] = 0;
        }
    }

    public static void main(String[] args) {
        zeroMatrix zm = new zeroMatrix();


    }

}
