public class binarySearchTree {
    // Implement a function to check if a binary tree is a binary search tree.
    public TreeNode root;

    public binarySearchTree() {
        root = null;
    }

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

    public boolean checkBST(TreeNode nnode, int max, int min) {
        if(nnode != null) {
           if(nnode.data > max || nnode.data < min) {
               return false;
           }
           return checkBST(nnode.leftChild, nnode.data, min) && checkBST(nnode.rightChild, nnode.data,  max);
        }
        return true;
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
        binarySearchTree bst = new binarySearchTree();
        bst.addNode(12);
        bst.addNode(8);
        bst.addNode(91);
        bst.addNode(1);
        bst.addNode(13);
        TreeNode root = bst.root;
        bst.inOrder(root);
        System.out.println(bst.checkBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}
