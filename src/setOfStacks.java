import java.util.ArrayList;
import java.util.Stack;

public class setOfStacks {
    ArrayList<Stack<Integer>> stacks = new ArrayList<>();


    public void push(int v) {
        Stack<Integer> last = stacks.get(stacks.size());
        if(last != null && !last.isEmpty()) {
            last.push(v);
        }else {
            Stack<Integer> st = new Stack<>();
            st.push(v);
            stacks.add(st);
        }
    }

    public int pop() {
        Stack<Integer> last = new Stack<>();
        int v = 0;
        if(last == null) {
            throw new NullPointerException();
        }
        v = last.pop();
        if(last.size() == 0){
            stacks.remove(stacks.size() - 1);
        }
        return v;
    }

    public static void main(String[] args) {
        setOfStacks ss = new setOfStacks();
    }
}
