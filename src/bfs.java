import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class bfs {
    public vertex vertexList[];
    public int size = 10;
    public int[][] adjMat;
    public int nverts;
    public int cursize;
    public Queue theQ;

    public bfs() {
        nverts = -1;
        adjMat = new int[size][size];
        vertexList = new vertex[size];
        cursize = 0;
        theQ = new Queue() {
            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean offer(Object o) {
                return false;
            }

            @Override
            public Object remove() {
                return null;
            }

            @Override
            public Object poll() {
                return null;
            }

            @Override
            public Object element() {
                return null;
            }

            @Override
            public Object peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        for(int  i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(char value) {
        vertex v = new vertex(value);
        vertexList[++nverts] = v;
        cursize++;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }



    public int getAdjacentVertex(int v) {
        for(int i = 0; i < cursize; i++) {
            if(adjMat[v][i] == 1 && vertexList[i].isVisited == false) {
                return i;
            }
        }
        return -1;
    }



    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void bfs() {
        vertex v = vertexList[0];
        theQ.add(0);
        displayVertex(0);
        v.isVisited = true;
        int v1;
        while(!theQ.isEmpty()) {
            int v2 = (int)theQ.poll();
            while((v1 = getAdjacentVertex(v2)) != -1) {
                vertexList[v1].isVisited = true;
                displayVertex(v1);
                theQ.add(v1);
            }
        }
    }

    public static void main(String[] args) {
        bfs gp = new bfs();
        gp.addVertex('A');
        gp.addVertex( 'B');
        gp.addVertex('C');
        gp.addVertex('D');
        gp.addVertex('E');
        gp.addEdge(1, 2);
        gp.addEdge(0, 1);
        gp.addEdge(0, 3);
        gp.addEdge(3, 4);
        gp.bfs();
    }

}
