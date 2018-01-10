public class inOrderSuccessor {

/*
    public TreeNode findSuccessor(TreeNode node) {
        if(node == null) {
            return null;
        }
        if(node.rightChild != null) {
            node = node.rightChild;
            TreeNode child = null;
            while(node != null) {
                child = node;
                node = node.leftChild;
            }
            return child;
        }else { // lets say it does not contain any right child
            TreeNode q = node;
            TreeNode x = q.parent;
            while(x != null && x.leftChild != q) {
                q = x;
                x = x.parent;
            }
            return x;
        }
    }
    */

    public static void main(String[] args) {

    }
}
