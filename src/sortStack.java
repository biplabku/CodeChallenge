import java.util.Stack;

public class sortStack {

    public void sortStack(Stack<Integer> stck1) {
        Stack<Integer> stck2 = new Stack();
        while(!stck1.isEmpty()) {
            int value = stck1.pop();
            while(!stck2.isEmpty() && value <= stck2.peek()) {
                stck1.push(stck2.pop());
            }
            stck2.push(value);
        }

        while(!stck2.isEmpty()) {
            stck1.push(stck2.pop());
        }
    }


    public void display(Stack<Integer> s) {
        for(int i = 0; i < s.size(); i++) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> thestack = new Stack();
        thestack.push(5);
        thestack.push(4);
        thestack.push(3);
        thestack.push(2);
        thestack.push(1);
        sortStack ss = new sortStack();
        ss.display(thestack);
    }
}
