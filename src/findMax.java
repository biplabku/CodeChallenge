public class findMax {

    // Write a method which finds the maximum of two numbers. You should not use if else or any
    // other comparison operator. EXAMPLE Input: 5, 10 Output: 10

    public static int findMaxNum(int firstNum, int secondNum) {
        //int result = String.valueOf(firstNum).
        int max = Math.max(firstNum, secondNum);
        return max;
    }

    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        System.out.println(findMaxNum(x, y));
    }
}
