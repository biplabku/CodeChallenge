public class getSuccessorMethod2 {

    // get the successor for a given node

    public getSuccessorMethod2() {

    }

    public TreeNode findNode(TreeNode nd) {

    }

    public static int getSuccessor(binarySearchTree cs, int value) {
        TreeNode rootq = cs.root;
        TreeNode node = null;
        while(rootq.data != value) {
            node = rootq;
            if(rootq.data < value) {
                rootq = rootq.leftChild;
            }else {
                rootq = rootq.rightChild;
            }
        }
        if(node == null) {
            return -1;
        }
        if(node.rightChild != null) {
            TreeNode temp = node.rightChild;
            while(temp.leftChild != null) {
                temp = temp.leftChild;
            }
            return temp.data;
        }else {
            TreeNode ancestor = node;
            TreeNode successor = null;
            while(node != null) {
                if(ancestor.data < value) {
                    successor = ancestor;
                    ancestor = ancestor.leftChild;
                }else {
                    ancestor = ancestor.rightChild;
                }
            }
            return successor.data;
        }
    }


    public static void main(String[] args) {
        binarySearchTree cs = new binarySearchTree();
        cs.addNode(15);
        cs.addNode(6);
        cs.addNode(3);
        cs.addNode(7);
        cs.addNode(2);
        cs.addNode(4);
        cs.addNode(13);
        cs.addNode(19);
        cs.addNode(18);
        cs.addNode(17);
        cs.addNode(20);
        System.out.println(getSuccessor(cs, 2));

    }
}
