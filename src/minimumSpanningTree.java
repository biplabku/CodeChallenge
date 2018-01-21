import java.util.Stack;

public class minimumSpanningTree {

    // creating a class for both breadth first search and depth first search
    public vertex vertexList[];
    public int size = 10;
    public int[][] adjMat;
    public int nverts;
    public int cursize;
    public Stack<Integer> thestack;

    public minimumSpanningTree() {
        nverts = -1;
        adjMat = new int[size][size];
        vertexList = new vertex[size];
        cursize = 0;
        thestack = new Stack<>();
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


    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public int getAdjacentVertex(int v) {
        for(int i = 0; i < cursize; i++) {
            if(adjMat[v][i] == 1 && vertexList[i].isVisited == false) {
                return i;
            }
        }
        return -1;
    }

    public void mst() {
        vertex v1 = vertexList[0];
        v1.isVisited = true;
        thestack.push(0);
        while(!thestack.isEmpty()) {
            int currentVertex = thestack.peek();
            int v = getAdjacentVertex(thestack.peek());
            if(v == -1) {
                thestack.pop();
            }else {
                vertexList[v].isVisited = true;
                thestack.push(v);
                displayVertex(currentVertex);
                displayVertex(v);
                System.out.println(" ");
            }
        }
        for(int i = 0; i < cursize; i++) {
            vertexList[i].isVisited = false;
        }
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }



    public static void main(String[] args) {
        minimumSpanningTree theGraph = new minimumSpanningTree();
        theGraph.addVertex('A');
        theGraph.addVertex( 'B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        theGraph.addEdge(0, 1);
        theGraph.addEdge(0, 2);
        theGraph.addEdge(0, 3);
        theGraph.addEdge(0, 4);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(1, 3);
        theGraph.addEdge(1, 4);
        theGraph.addEdge(2, 3);
        theGraph.addEdge(2, 4);
        theGraph.addEdge(3, 4);
        theGraph.mst();

    }
}
