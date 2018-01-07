import java.util.Stack;

public class dfs {
    public vertex vertexList[];
    public int size = 10;
    public int[][] adjMat;
    public int nverts;
    public int cursize;
    public Stack<Integer> thestack;

    public dfs() {
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


    public void dfs() {
        vertex v = vertexList[0];
        v.isVisited = true;
        displayVertex(0);
        thestack.push(0);
        while(!thestack.isEmpty()) {
            int v2 = getAdjacentVertex(thestack.peek());
            if(v2 == -1){
                thestack.pop();
            }else {
                vertexList[v2].isVisited = true;
                displayVertex(v2);
                thestack.push(v2);
            }
        }
        for(int i = 0; i < cursize; i++) {
            vertexList[i].isVisited = false;
        }
    }


    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    public static void main(String[] args) {
        dfs gp = new dfs();
        gp.addVertex('A');
        gp.addVertex( 'B');
        gp.addVertex('C');
        gp.addVertex('D');
        gp.addVertex('E');
        gp.addEdge(1, 2);
        gp.addEdge(0, 1);
        gp.addEdge(0, 3);
        gp.addEdge(3, 4);
        gp.dfs();
    }

}
