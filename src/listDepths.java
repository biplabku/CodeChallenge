public class listDepths {

    // given a binary tree, design an algorithm which creates a linkedlist of all the nodes
    // at each depth(ex. if you have a tree with Depth D, you will have D linkedList)

    public TreeNode root;
    public checkPalindrome list;

    public listDepths() {

    }

    /*
    public boolean checkChild(TreeNode nnode) {

    }

    public TreeNode findDepths(TreeNode nnode) {
        if(nnode != null) {

        }
    }
 */

    public TreeNode inOrder(TreeNode nnode) {
        if(nnode != null) {
            System.out.println(nnode.data);
            inOrder(nnode.leftChild);
            inOrder(nnode.rightChild);
        }
        return null;
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


    public static void main(String[] args) {
        listDepths bst = new listDepths();
        TreeNode node = new TreeNode(8);
        bst.addNode(node.data);
        bst.addNode(91);
        bst.addNode(1);
        bst.addNode(13);
        bst.addNode(12);
        bst.addNode(11);
        bst.addNode(101);
        TreeNode root = bst.root;
        bst.inOrder(root);
    }
}
