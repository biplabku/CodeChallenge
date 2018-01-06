public class intersectionLinklist {
    public LinkNode root;
    public intersectionLinklist() {
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

    public char isIntersection (LinkNode cur1, LinkNode cur2) {
        String str1 = "";
        String str2 = "";

        while(cur1 !=  null || cur2 != null) {
            if(cur1 != null) {
                str1 = str1 + cur1.data;
                cur1 = cur1.next;
            }else {
                str2 = str2 + cur2.data;
                cur2 = cur2.next;
            }
        }
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        char val  = 0;
        System.out.println(str1 + " string " + str2);
        while(str1.charAt(i) == str2.charAt(j)) {
            val = str1.charAt(i);
            System.out.println(str1.charAt(i));
            i--;
            j--;
        }
        return val;
    }
    public int isIntersection1 (intersectionLinklist list1, intersectionLinklist list2) {
        int size1 = 0;
        int size2 = 0;
        LinkNode prev1 = null;
        LinkNode prev2 = null;
        LinkNode cur1 = list1.root;
        LinkNode cur2 = list2.root;
        while(cur1 != null || cur2 != null) {
           if(cur1 != null) {
               size1++;
               prev1 = cur1;
               cur1 = cur1.next;

           }else {
               size2++;
               prev2 = cur2;
               cur2 = cur2.next;
           }
        }
        if(prev1.data != prev2.data) {
            return -1;
        }
        LinkNode shorter = size1 < size2 ? list1.root: list2.root;
        LinkNode longer = size1 < size2 ? list2.root: list1.root;
        int count = Math.abs(size1 - size2);
        LinkNode head= longer;

        while(count > 0 && head != null) {
            head = head.next;
            count--;
        }
        longer = head;
        while(shorter != longer) {
            System.out.println(shorter + " size "  + longer);

            shorter = shorter.next;
            longer = longer.next;
        }
        return longer.data;
    }

    public static void main(String[] args) {
        intersectionLinklist ch = new intersectionLinklist();
        ch.addNode(3);
        ch.addNode(5);
        ch.addNode(8);
        ch.addNode(5);
        ch.addNode(10);
        ch.addNode(2);
        ch.addNode(1);

        intersectionLinklist ch1 = new intersectionLinklist();
        ch1.addNode(9);
        ch1.addNode(8);
        ch1.addNode(7);
        ch1.addNode(10);
        ch1.addNode(2);
        ch1.addNode(1);
        System.out.println(ch.isIntersection1(ch, ch1));
    }
}
