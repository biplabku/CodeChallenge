import java.util.HashMap;
import java.util.HashSet;

public class removeDups {
    // Write code to remove duplicate from an unsorted linked List.

    public removeDups() {

    }

    public checkPalindrome removeDuplicateElements(LinkNode nnode) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        while(nnode != null) {
            
        }
    }




    public static void main(String[] args) {
        checkPalindrome lst = new checkPalindrome();
        lst.addNode(12);
        lst.addNode(1);
        lst.addNode(5);
        lst.addNode(9);
        lst.addNode(3);
        lst.addNode(2);
        lst.addNode(1);
        lst.addNode(12);
        lst.addNode(8);
        lst.display();
        removeDups rp = new removeDups();
        rp.removeDuplicateElements(lst.root);
    }
}
