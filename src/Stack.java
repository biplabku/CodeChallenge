public class Stack {

    public int data;
    public int[] array;
    public int size;
    public int cursize;
    public int top;

    public Stack(int val) {
        size = val;
        array = new int[size];
        cursize = 0;
        top = -1;
    }

    public int push(int val) {
        if(top > size) {
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
        array[++top] = val;
        cursize++;
        return val;
    }

    public int pop() {
        if(top < 0) {
            throw new NullPointerException();
        }
        int el = array[top];
        top--;
        cursize--;
        return el;
    }

    public int peek() {
        return array[top];
    }

    public void display() {
        for(int i = 0; i < cursize; i++) {
            System.out.println(array[i]);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack thestack = new Stack(5);
        thestack.push(5);
        thestack.push(4);
        thestack.push(3);
        thestack.push(2);
        thestack.push(1);
        thestack.display();
        System.out.println(thestack.isEmpty());
    }
}
