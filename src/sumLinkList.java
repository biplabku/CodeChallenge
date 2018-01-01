import sun.plugin.javascript.navig4.Link;

public class sumLinkList {
    // You have two numbers represented by a linkedList, where each node contains a single digit.
    // The digits are stored in reverse order, such that the 1s digit is at the head of the list.
    // Write a function that adds the two numbers and returns the sum as a linked list.


    public sumLinkList() {
    }


    public static void display(checkPalindrome list) {
        LinkNode cur = list.root;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    public static checkPalindrome add2Lists(checkPalindrome l1, checkPalindrome l2) {
        int carry = 0;
        int sum = 0;
        LinkNode cur1 = l1.root;
        LinkNode cur2 = l2.root;
        checkPalindrome result = new checkPalindrome();
        while(cur1 != null & cur2 != null) {
            sum = cur1.data + cur2.data + carry;
            if(sum < 10) {
                result.addNode(sum);
                carry = 0;
            } else {
                result.addNode(sum%10);
                carry = sum/10;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if(carry > 0) {
            result.addNode(carry);
        }
        return result;
    }


    public static checkPalindrome reverseList(checkPalindrome list) {
        LinkNode cur = list.root;
        LinkNode prev = null;
        LinkNode nxt = null;
        while(cur != null) {
            nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        list.root = prev;
        return list;
    }

    public static void main(String[] args) {
        sumLinkList result = new sumLinkList();
        checkPalindrome link1 = new checkPalindrome();
        link1.addNode(7);
        link1.addNode(1);
        link1.addNode(6);
        // link1.addNode(2);
        checkPalindrome link2 = new checkPalindrome();
        link2.addNode(5);
        link2.addNode(9);
        link2.addNode(2);
        //add2Lists(ch1, ch2);
        //link1 = reverseList(link1);
        //link2 = reverseList(link2);
        // display(link2);
        checkPalindrome res = add2Lists(link1, link2);
        res = reverseList(res);
        display(res);

    }
}
