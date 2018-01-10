public class firstCommonAncestor {


    // write an algorithm to find the lowest common ancestor given 2 binary nodes.

    public TreeNode findLowestAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        while(root != null) {
            int value = root.data;
            if(value < n1.data && value < n2.data) {
                root = root.leftChild;
            }else if(value >= n1.data && value >= n2.data) {
                root = root.rightChild;
            }else {
                return root;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
