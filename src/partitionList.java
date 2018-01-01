public class partitionList {

    // Write a code to partition a linklist around a value x, such that all nodes less than x comes before
    // all nodes greater than or equal to x. If x is contained within the list, the values of x only need to be after
    // the elements less than x. the partition element can appear anywhere in the right partition.,
    // it does not need to appear between left and right partitions

    public partitionList() {

    }

    public void partitionLinkList(checkPalindrome list, int value) {
        LinkNode cur = list.root;
        checkPalindrome lst1 = new checkPalindrome();
        checkPalindrome lst2 = new checkPalindrome();
        while(cur != null) {
            if(cur.data < value) {
                lst1.addNode(cur.data);
            }else {
                lst2.addNode(cur.data);
            }
            cur = cur.next;
        }
        // constructed the 2 list and now we can add both of the list
        LinkNode head1 = lst1.root;
        LinkNode head2 = lst2.root;
        LinkNode tmp =null;
        while(head1 != null) {
           tmp =  head1;
           head1 = head1.next;
        }
        while(head2 != null) {
            tmp.next = head2;
            head2 = head2.next;
        }
        head1 = lst1.root;
        while(head1 != null) {
            System.out.println(head1.data);
        }
    }


    public static void main(String[] args) {
        checkPalindrome list = new checkPalindrome();
        list.addNode(6);
        list.addNode(3);
        list.addNode(5);
        list.addNode(8);
        list.addNode(9);
        list.addNode(1);
        list.addNode(0);
        list.display();
    }
}
