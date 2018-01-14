import java.util.ArrayList;
import java.util.Queue;

public class subArraySum {


    // Given a list of  numbers, determine if a contiguous elements of the list sum to an input number

    public ArrayList<Integer> findListMethod1(int[] array, int target) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                sum = sum + array[j];
                list.add(array[j]);
                if(sum == target) {
                    return list;
                }
            }
            sum = 0;
            list.clear();
        }
        return null;
    }

    // Implementing the sliding window technicue to solve the same questions
    public ArrayList<Integer> findListMethod2(int[] array, int target) {
        int index1 = 0;
        int index2 = 0;
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            index2++;
            if(sum > target ){
                sum = sum - array[index1];
                index1++;
                if(sum == target) {
                    break;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = index1; i < index2; i++) {
            list.add(array[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        subArraySum ss = new subArraySum();
        int[] array = new int[] {5,1,3,4, 9};
        int target = 13;

        System.out.println(ss.findListMethod2(array, target));

    }
}
