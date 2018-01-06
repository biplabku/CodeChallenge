public class returnKthToLast {

    public LinkNode root;
    public returnKthToLast() {
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

    public int returnKth(LinkNode node) {
        int index1 = 0;
        int index2 = 0;
        while(node != null) {
            
        }
    }

    public static void main(String[] args) {
        returnKthToLast ch = new returnKthToLast();
        ch.addNode(1);
        ch.addNode(2);
        ch.addNode(4);
        ch.addNode(2);
        ch.addNode(1);
        ch.addNode(7);
        ch.addNode(9);
        ch.addNode(5);
        ch.display();
        System.out.println(ch.isPalindrome());
    }
}
