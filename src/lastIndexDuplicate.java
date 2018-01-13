public class lastIndexDuplicate {


    // find the last index of the duplicate element in the array

    public static int findIndexDup(int[] array) {
        for(int  i = array.length-1; i > 0; i--) {
            if(array[i] == array[i - 1]){
                return i -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = new int[] {1,1};
        System.out.println(findIndexDup(array));
    }
}
