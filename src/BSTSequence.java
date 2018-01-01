import java.util.ArrayList;
import java.util.HashMap;

public class BSTSequence {

        // A binary search tree was created by traversing through an array from left to right and inserting each element.
        // a given a binary search tree with distinvt elements, print all possible arrays that could have led to this tree.

        public TreeNode root;
        public ArrayList<Integer> list = new ArrayList<>();
        public ArrayList<Integer> list1 = new ArrayList<>();

        HashMap<Integer, ArrayList<Integer>> hmap = new HashMap<>();

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
                System.out.println(nnode.data);
                inOrder(nnode.leftChild);
                inOrder(nnode.rightChild);
            }
            return null;
        }

        public TreeNode constBSTArray(TreeNode nnode, TreeNode nnode1, int count) {
            if(nnode != null && count == 1) {
                list.add(nnode.data);
                constBSTArray(nnode.leftChild, nnode1, count);
                constBSTArray(nnode.rightChild, nnode1, count);
            }else if(nnode1 != null && count == 0){
                list1.add(nnode1.data);
                constBSTArray(nnode, nnode1.rightChild, count);
                constBSTArray(nnode, nnode1.leftChild, count);
            }
            return null;
        }

        public void addList(TreeNode root1, TreeNode root2) {
            int count = 1;
            constBSTArray(root1, root2, 1);
            hmap.put(0, list);
            count = 0;
            constBSTArray(root1, root2, count);
            hmap.put(1, list1);
        }

        public static void main(String[] args) {
            BSTSequence bst = new BSTSequence();
            TreeNode node = new TreeNode(8);
            bst.addNode(node.data);
            bst.addNode(91);
            bst.addNode(1);
            bst.addNode(13);
            bst.addNode(12);
            bst.addNode(11);
            bst.addNode(101);
            TreeNode root = bst.root;
            //bst.constBSTArray(root, root,);
            bst.addList(root, root);
            System.out.println(bst.hmap);
            // bst.inOrder(root);
        }


}
