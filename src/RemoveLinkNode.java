public class RemoveLinkNode {
    public LinkNode root;
    public int tot_els;

    public RemoveLinkNode() {
        root = null;
        tot_els = 0;
    }

    public void addNode(int val) {
        LinkNode nnode = new LinkNode(val);
        if(root == null) {
            root = nnode;
        }else {
            LinkNode cur = root;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = nnode;
        }
        tot_els++;
    }


    public void display() {
        LinkNode cur = root;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }


    public void deleteNode(int val) {
        LinkNode cur = root;
        if(root == null || (root.data == val && root.next == null)) {
            root = null;
            return ;
        }
        if(root.data == val && root.next != null) {
            root = root.next;
            return;
        }
        LinkNode prev = cur;
        while(cur.data != val) {
            prev = cur;
            cur = cur.next;
        }

        prev.next = cur.next;
        //prev.next = null;
    }


    public static void main(String[] args) {
        RemoveLinkNode nn = new RemoveLinkNode();
        nn.addNode(12);

        nn.addNode(1);
        nn.addNode(3);
        nn.addNode(5);
        nn.addNode(9);
        nn.addNode(2);

        nn.deleteNode( 5);
        nn.display();

    }
}
