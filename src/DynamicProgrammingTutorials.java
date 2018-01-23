public class DynamicProgrammingTutorials {


    public static int findFibo(int number) {
        if(number <= 1) {
            return number;
        }
        int one = 0;
        int second = 1;
        for(int i = 2; i <= number; i++) {
            int f = one + second;
            second = one;
            one = f;

        }
        return one;
    }


    public static void main(String[] args) {
        DynamicProgrammingTutorials ds = new DynamicProgrammingTutorials();
        int number  = 9;
        System.out.println(findFibo(number));

    }
}
