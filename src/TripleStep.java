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

    public static void main(String[] args) {
        int number  = 2;
        System.out.println(countTheSteps(number));
    }
}
