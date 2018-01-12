import java.util.LinkedList;

public class mergeSortedList {


    public void merge2List(checkPalindrome list1, checkPalindrome list2) {
        LinkNode cur1 = list1.root;
        LinkNode cur2 = list2.root;
        checkPalindrome result = new checkPalindrome();
        int size = list1.tot_els > list2.tot_els ? list1.tot_els : list2.tot_els;
        while(cur1 != null && cur2 != null) {
            if(cur1.data < cur2.data) {
                result.addNode(cur1.data);
                cur1 = cur1.next;
            }else if(cur1.data == cur2.data) {
                result.addNode(cur1.data);
                result.addNode(cur2.data);
            }else {
                result.addNode(cur2.data);
                cur2 = cur2.next;
            }
        }

        while(cur1 != null) {
            result.addNode(cur1.data);
            cur1 = cur1.next;
        }
        while(cur2 != null) {
            result.addNode(cur2.data);
            cur2 = cur2.next;
        }
        result.display();

    }

    public static void main(String[] args) {

        mergeSortedList ms = new mergeSortedList();
        checkPalindrome list1 = new checkPalindrome();
        checkPalindrome list2 = new checkPalindrome();

        list1.addNode(1);
        list1.addNode(2);
        list1.addNode(9);
        list2.addNode(3);
        list2.addNode(5);
        list2.addNode(6);
        ms.merge2List(list1, list2);
    }
}
