public class minimalTree {
    // how to create a binary search tree with minimum height
    public TreeNode root;

    public minimalTree() {

    }

    public void inOrder(TreeNode nnode) {
        System.out.println(nnode.data);

        if(nnode == null) {
            return ;
        }
        inOrder(nnode.leftChild);
        System.out.println(nnode.data);
        inOrder(nnode.rightChild);
    }

    public TreeNode createBinarySearchTree(int[] array, int left, int right) {
        if(left > right) {
            return null;
        }

        int middle = (left + right)/2;
        TreeNode node = new TreeNode(array[middle]);
        addNode(createBinarySearchTree(array, left, middle- 1).data);
        addNode(createBinarySearchTree(array, middle + 1, right).data);
        return node;
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
        balanceTree tree = new balanceTree();
        int[] array = new int[] {1,2,3,4,5,6,7,8};
        minimalTree mm = new minimalTree();
        mm.createBinarySearchTree(array, 0, array.length - 1);
        mm.inOrder(mm.root);

    }
}
