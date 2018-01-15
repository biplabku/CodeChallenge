public class searchInRotatedArray {
    // Given a sorted array of n integers that has been rotated an unknown number of times.
    // Write code to find an element in the array.You may assume that the array was originally sorted.

    public int[] array = new int[] {15,16,19,20,25,1,3,4,5,7,10,14};


    public  int search(int target, int left, int right) {
        int mid = (left +right)/2;
        if(mid == target) {
            return mid;
        }
        if(right < left) {
            return  -1;
        }
        if(array[left] < array[mid]) {
            if(target >= array[left]  && target <= array[mid]) {
                return search(target, left, mid -1);
            }else {
                return search(target, mid+1, right);
            }
        }else if(array[mid] < array[left]) {
            if(target > array[mid] && target <= array[right]) {
                return search(target, mid + 1, right);
            }else {
                return search(target, left, mid - 1);
            }
        }else if(array[left] == array[mid]) {
            if(array[mid] != array[right]) {
                return search(target,mid + 1, right);
            }else {
                int result = search(target, left, mid -1 );
                if(result == -1) {
                    return search(target, mid + 1, right);
                }else {
                    return result;
                }
            }
        }
        return  -1;
    }


    public static void main(String[] args) {
        int target = 5;
        searchInRotatedArray ss = new searchInRotatedArray();
        System.out.println(ss.search(5, 0, 10 ));
    }
}
