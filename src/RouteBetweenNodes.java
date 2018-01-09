import java.util.Stack;

public class RouteBetweenNodes {

    public boolean isRoute (graph gp, vertex v1, vertex v2) {
        Stack<Integer> thestack = new Stack<>();
        gp.vertexList[0].isVisited = true;
        thestack.push(0);
        int v = 0;
        while(!thestack.isEmpty()) {
            v = gp.getAdjacentVertex(thestack.peek());
            System.out.println(v);
            if(v == -1 ){
                return false;
            } else if(gp.vertexList[v].label == v2.label){
                return true;
            }else {
                thestack.pop();
                thestack.push(v);
                gp.vertexList[v].isVisited = true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        RouteBetweenNodes rr = new RouteBetweenNodes();
        graph gp = new graph();
        gp.addVertex('A');
        gp.addVertex('B');
        gp.addVertex('C');
        gp.addVertex('D');
        gp.addVertex('E');
        gp.addEdge(1, 2);
        gp.addEdge(0, 1);
        gp.addEdge(0, 3);
        gp.addEdge(3, 4);
        vertex v1 = new vertex('A');
        vertex v2 = new vertex('C');
        System.out.println(rr.isRoute(gp, v1, v2));
    }
}
