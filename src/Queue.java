public class Queue {

    public int data;
    public int rear;
    public int front;
    public int[] array;
    public int cursize;
    public int size;

    public Queue( int val) {
        rear = -1;
        front  = 0;
        size = val;
        array = new int[size];
        cursize = 0;
    }

    public boolean isEmpty() {
        return rear == front;
    }


    public int Enqueue(int item) {
        
    }

    public int Dequeue() {

    }

    public static void main(String[] args) {

    }
}
