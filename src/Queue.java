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
        if(rear > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[++rear] = item;
        return item;
    }

    public int Dequeue() {
        if(front == rear) {
            throw new StackOverflowError("Out of bounds");
        }
        int el = array[front];
        front++;
        return el;
    }


    public void display() {
       for(int i = front; i <= rear; i++) {
           System.out.print(array[i] +" ");
       }
    }

    public static void main(String[] args) {
        Queue theQueue = new Queue(5);
        theQueue.Enqueue(5);
        theQueue.Enqueue(4);
        theQueue.Enqueue(3);
        theQueue.Enqueue(2);
        theQueue.Enqueue(1);
        theQueue.display();
    }
}
