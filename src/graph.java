public class graph {

    // creating a class for both breadth first search and depth first search
    public vertex vertexList[];
    public int size = 10;
    public int[][] adjMat;
    public int nverts;

    public graph() {
        nverts = -1;
        adjMat = new int[size][size];
        vertexList = new vertex[size];
        for(int  i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(int value) {
        vertex v = new vertex(value);
        vertexList[nverts++] = v;
    }


    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }



    public static void main(String[] args) {
        graph gp = new graph();
        gp.addVertex(1);
        gp.addVertex(2);
        gp.addVertex(3);
        gp.addVertex(4);

        gp.addEdge(1, 2);
        gp.addEdge(1, 3);
        gp.addEdge(2, 1);
        gp.addEdge(2, 4);
        gp.addEdge(3, 2);
        gp.addEdge(4, 1);
        gp.addEdge(4, 4);
    }

}
