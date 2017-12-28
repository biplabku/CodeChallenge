public class mergeSortArrays {
    // You are given two sorted arrays, A and B, and A has a large enough
    // buffer at the end to hold B. Write a method to merge B into A in
    // sorted order.

    public static void mergeSortedArrays(int[] A, int[] B) {
        // since its already given A is having a large area that it can hold Array B
        int[] result = new int[A.length + B.length];
        int ptr1 = 0;
        int ptr2 = 0;
        int  i = 0;
        while(ptr1 < A.length & ptr2 < B.length) {
            if(A[ptr1] > B[ptr2]) {
                result[i] = B[ptr2];
                i++;
                ptr2++;
            }else if(A[ptr1] < B[ptr2]) {
                result[i] = B[ptr1];
                i++;
                ptr1++;
            }else {
                result[i] = A[ptr1];
                i++;
                ptr1++;
                result[i] = B[ptr2];
                i++;
                ptr2++;
            }
        }
        while(ptr1 < A.length) {
            result[i] = A[ptr1];
            i++;
            ptr1++;
        }

        while(ptr2 < B.length) {
            result[i] = B[ptr2];
            i++;
            ptr2++;
        }
        System.out.println(ptr1 + "g " + ptr2);
        for(int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }

    }

    public static void main(String[] args) {
        int[] B = {1,2,3,4,5};
        int[] A = {1, 8, 9, 10,11 ,12, 8, 0, 0, 0, 0, 0};
        mergeSortedArrays(A,B);
    }
}
