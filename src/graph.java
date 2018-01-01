public class graph {

    // creating a class for both breadth first search and depth first search
    public vertex vertexList[];
    public int size = 10;
    public int[][] adjMat;
    public int nverts;

    public graph() {
        nverts = 0;
        adjMat = new int[size][size];
        vertexList = new vertex[size];
        for(int  i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                adjMat[i][j] = 0;
            }
        }
    }


    
}
