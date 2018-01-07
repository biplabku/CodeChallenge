public class balanceTree {
    // Implement a function to check if a binary tree is balanced. For the purpose of this question,
    // a balanced tree is defined to be a binary tree such that the heights of the two subtrees of any node
    // never differ by more than one.

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



    public TreeNode inOrder(TreeNode nnode) {
        if(nnode != null) {
            inOrder(nnode.leftChild);
            System.out.println(nnode.data);
            inOrder(nnode.rightChild);
        }
        return null;
    }

    public TreeNode postOrder(TreeNode nnode) {
        if(nnode != null) {
            System.out.println(nnode.data);
            postOrder(nnode.leftChild);
            postOrder(nnode.rightChild);
        }
        return null;
    }

    public TreeNode preOrder(TreeNode nnode) {
        if(nnode != null) {
            preOrder(nnode.leftChild);
            preOrder(nnode.rightChild);
            System.out.println(nnode.data);
        }
        return null;
    }

    public boolean isBalance(TreeNode node) {
        if(node  == null) {
            return true;
        }
        int diff = getHeight(node.leftChild) - getHeight(node.rightChild);
        System.out.println(diff + " l " + getHeight(node.leftChild) + " r " + getHeight(node.rightChild) );
        if(Math.abs(diff ) > 1) {
            return false;
        } else {
            return isBalance(node.leftChild)  && isBalance(node.rightChild);
        }
    }

    public int getHeight(TreeNode nnode) {
        if(nnode == null) {
            return 0;
        }
        return 1 + (Math.max(getHeight(nnode.leftChild), getHeight(nnode.rightChild)));
    }

    public static void main(String[] args) {
        balanceTree bst = new balanceTree();
        bst.addNode(12);
        bst.addNode(8);
        bst.addNode(91);
        bst.addNode(1);
        bst.addNode(13);
        TreeNode root = bst.root;
        //bst.inOrder(root);
        System.out.println(bst.isBalance(root));
    }
}
