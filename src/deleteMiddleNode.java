public class deleteMiddleNode {
    public LinkNode root;
    public deleteMiddleNode() {
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

    public boolean deleteNode(LinkNode node) {
        if (node == null || node.next == null) {
            return false; // Failure
        }
        LinkNode prev = node.next;
        node.data = prev.data;
        node.next = prev.next;
        return true;
    }


    public void display() {
        LinkNode cur = root;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    public boolean isPalindrome() {
        // checking palindrome
        LinkNode cur = root;
        String str1 = "";
        if(cur == null) {
            return false;
        }
        while(cur != null) {
            str1 = str1 + (cur.data);
            cur = cur.next;
        }
        for(int  i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str1.charAt(str1.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        deleteMiddleNode ch = new deleteMiddleNode();
        ch.addNode(1);
        ch.addNode(2);
        ch.addNode(4);
        ch.addNode(7);
        ch.addNode(8);
        ch.addNode(2);
        ch.addNode(9);
        ch.display();
        LinkNode root = ch.root;
        int i = 3;
        while(i > 0) {
            root = root.next;
            i--;
        }
        LinkNode n = new LinkNode(7);
        System.out.println(ch.isPalindrome());
        System.out.println(ch.deleteNode(root));
        ch.display();
    }

}
