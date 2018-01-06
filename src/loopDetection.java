public class loopDetection {

    public loopDetection() {

    }

    // This method needs modification of the linklist node.
    // having a variable for saving the status of visited node
    /*
    public int detectLoop(LinkNode cur) {
        while(cur != null) {
            if(cur.isVisited == true) {
                return cur.data;
            }
            cur.isVisited = true;
            cur = cur.next;
        }

        return -1;
    }
    */

    public boolean hasCycle(LinkNode nnode) {
        if(nnode == null) {
            return false;
        }
        LinkNode slow = nnode;
        LinkNode fast = nnode.next;

        while(slow != null && fast != null && fast.next != null) {
            System.out.println(slow.data + " " + fast.data);
            if(slow.data == fast.data) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    public static void main(String[] args) {
        checkPalindrome list = new checkPalindrome();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(1);
        // list.display();
        loopDetection dp = new loopDetection();
        System.out.println(dp.hasCycle(list.root));

    }
}
