public class TripleStep {

    // A child is running up a staircase with n steps and can hop either 1, 2 or 3 steps at a time. Implement
    // a method to count how many possible ways the child can run up the stairs

    public static int countTheSteps(int number) {
        if(number < 1) {
            return 1;
        }else {
            return countTheSteps(number - 1) + countTheSteps(number - 2) + countTheSteps(number - 3);
        }
    }

    public static int countTheStepsMethod2(int number, int[] memo) {
        if(number < 0) {
            return 0;
        }else if(number == 0) {
            return 1;
        }else if(memo[number] > -1) {
            return memo[number];
        }else {
            memo[number] = countTheStepsMethod2(number - 1, memo) + countTheStepsMethod2(number - 2, memo) + countTheStepsMethod2(number - 3, memo);
        }
        return memo[number];
    }

    public static void main(String[] args) {
        int number  = 1;
        System.out.println(countTheSteps(number));
    }
}
