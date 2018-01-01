public class lowestCommonAncestor {

    // Given the values of two  nodes in  a binary search tree, find the lowest common ancestor
    // You may assume that both values already exist in the tree.

    public TreeNode root;

    public void addNode(int value) {
        TreeNode nnode = new TreeNode(value);
        if(root == null) {
            root = nnode;
        }else {
            TreeNode tmp = root;
            TreeNode cur = null;
            Boolean isLeftchild = false;
            while(tmp != null) {
                cur = tmp;
                if(value < tmp.data) {
                    tmp = tmp.leftChild;
                    isLeftchild = true;
                }else {
                    tmp = tmp.rightChild;
                    isLeftchild = false;
                }
            }
            if(isLeftchild) {
                cur.leftChild = nnode;
            }else {
                cur.rightChild = nnode;
            }
        }
    }

    public TreeNode findCommonAncestor(TreeNode root, int node1,  int node2) {
        while(root != null) {
            int value = root.data;
            if(value > node1 && value > node2) {
                root = root.leftChild;
            } else if(value < node1 && value < node2){
                root = root.rightChild;
            }else {
                return root;
            }
        }
        return null;
    }


    public TreeNode inOrder(TreeNode nnode) {
        if(nnode != null) {
            inOrder(nnode.leftChild);
            inOrder(nnode.rightChild);
            System.out.println(nnode.data);
        }
        return null;
    }
    public static void main(String[] args) {
        lowestCommonAncestor bst = new lowestCommonAncestor();
        TreeNode r = new TreeNode(12);
        bst.addNode(r.data);
        bst.addNode(8);
        bst.addNode(91);
        bst.addNode(1);
        bst.addNode(13);
        TreeNode root = bst.root;
        bst.inOrder(root);
        TreeNode tr = bst.findCommonAncestor(r, 8, 13);
        System.out.println(tr.data);
    }
}
