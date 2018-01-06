public class partitionList {

    // Write a code to partition a linklist around a value x, such that all nodes less than x comes before
    // all nodes greater than or equal to x. If x is contained within the list, the values of x only need to be after
    // the elements less than x. the partition element can appear anywhere in the right partition.,
    // it does not need to appear between left and right partitions

    public LinkNode root;
    public partitionList() {

        root = null;
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
    }


    public void display() {
        LinkNode cur = root;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }


    public void partitionList(LinkNode cur, int val) {
        checkPalindrome list = new checkPalindrome();
        checkPalindrome list2 = new checkPalindrome();
        LinkNode last = null;
        while(cur != null) {
            if(cur.data < val) { // for nodes value less than
                list.addNode(cur.data);
                last = cur;
            }else {
                list2.addNode(cur.data);
            }
            cur = cur.next;
        }
        LinkNode root2 = list2.root;
        while(root2 != null) {
            list.addNode(root2.data);
            root2 = root2.next;
        }
        LinkNode cur1 = list.root;
        while(cur1 != null) {
            System.out.println(cur1.data);
            cur1 = cur1.next;
        }
    }

    public static void main(String[] args) {
        partitionList ch = new partitionList();
        ch.addNode(3);
        ch.addNode(5);
        ch.addNode(8);
        ch.addNode(5);
        ch.addNode(10);
        ch.addNode(2);
        ch.addNode(1);
        ch.partitionList(ch.root, 5);

    }
}
