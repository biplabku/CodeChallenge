import java.util.Stack;

public class MyQueue {
    Stack<Integer> thestack1 = new Stack<>();
    Stack<Integer> thestack2 = new Stack<>();

    public void Enque(int value) {
        thestack1.push(value);
    }

    public void Deque() {
        while(!thestack1.isEmpty()) {
            thestack2.push(thestack1.pop());
        }
        int value = thestack2.pop();
        while(!thestack2.isEmpty()) {
            thestack1.push(thestack2.pop());
        }
    }


    public void display(){
        for(int i = 0; i < thestack1.size() + 4; i++) {
            System.out.println(thestack1.pop());
        }
    }

    public static void main(String[] args) {
        MyQueue mm =new MyQueue();
        mm.Enque(12);
        mm.Enque(1);
        mm.Enque(8);
        mm.Enque(7);
        mm.Enque(31);
        mm.Deque();
        mm.display();
    }
}
