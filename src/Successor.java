public class Successor {

        // Write an algorithm to find the "next" node (i.e in-order successor) of a given node in
        // a binary search tree. You may assume that each node has a link to its parent.

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

        // in-order successor or the next node. Higher than the current node but smallest one
        public TreeNode findinOrderSuccessor(TreeNode nnode) {
            if(nnode == null) {
                return null;
            }
            if(nnode.rightChild != null) {
                nnode = nnode.rightChild;
                while(nnode.leftChild != null) {
                    nnode = nnode.leftChild;
                }
            }
            return nnode;
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
            Successor bst = new Successor();
            TreeNode node = new TreeNode(8);
            bst.addNode(node.data);
            bst.addNode(91);
            bst.addNode(1);
            bst.addNode(13);
            bst.addNode(12);
            bst.addNode(11);
            bst.addNode(101);
            TreeNode root = bst.root;
            int data = bst.findinOrderSuccessor(root).data;
            //bst.inOrder(root);
            System.out.println(data);
        }

}
