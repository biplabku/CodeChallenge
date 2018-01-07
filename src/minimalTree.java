public class minimalTree {
    // how to create a binary search tree with minimum height
    static TreeNode root;


    public void preOrder(TreeNode nnode) {
        if(nnode == null) {
            return ;
        }
        System.out.println(nnode.data);
        preOrder(nnode.leftChild);
        preOrder(nnode.rightChild);
    }

    public TreeNode createBinarySearchTree(int[] array, int left, int right) {
        if(left > right) {
            return null;
        }

        int middle = (left + right)/2;
        TreeNode node = new TreeNode(array[middle]);

        node.leftChild = createBinarySearchTree(array, left, middle- 1);

        node.rightChild = createBinarySearchTree(array, middle + 1, right);

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
        int[] array = new int[] {1,2,3,4,5,6,7};
        int len = array.length;
        minimalTree mm = new minimalTree();
        root = mm.createBinarySearchTree(array, 0, len -1);
        mm.preOrder(mm.root);

    }
}
