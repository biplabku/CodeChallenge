import java.util.HashMap;

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

    public static HashMap<Integer, Integer> hmap = new HashMap<>();

    public static int findFib2(int number) {
        if(number <= 1) {
            return number;
        }else if(!hmap.containsKey(number )) {
            hmap.put(number, (findFib2(number - 1) + findFib2(number - 2)));
        }
        return hmap.get(number);

    }

    public static void main(String[] args) {
        DynamicProgrammingTutorials ds = new DynamicProgrammingTutorials();
        int number  = 9;
        System.out.println(findFibo(number));
        System.out.println(findFib2(number));

    }
}
