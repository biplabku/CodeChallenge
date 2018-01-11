public class checkSubtree {


    // T1 and T2 are two very large binary tree, with T1 much bigger than T2. Create an
    // algorithm to determine if T2 is a subtree of T1.

    public boolean isCheckSubtreeMethod1(TreeNode T1, TreeNode T2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        getOrderString(sb1, T1);
        getOrderString(sb2, T2);

        return sb1.indexOf(sb2.toString()) != -1;
    }

    public void getOrderString(StringBuilder sb, TreeNode node ){
        if(node == null) {
            sb.append('X');
            return;
        }
        sb.append(node.data);
        getOrderString(sb, node.leftChild);
        getOrderString(sb, node.rightChild);
    }

    public static void main(String[] args) {
        checkSubtree check = new checkSubtree();
        TreeNode n1 = new TreeNode(12);
        TreeNode n2 = new TreeNode(8);
        System.out.println(check.isCheckSubtreeMethod1(n1, n2));
    }

}
