public class checkSubtreeSolution2 {



    public boolean containsTree(TreeNode n1, TreeNode n2) {
        if(n1 == null) {
            return true;
        }
        return checkSubtree(n1, n2);
    }

    public boolean checkSubtree(TreeNode T1, TreeNode T2) {
        if(T1 == null) {
            return false;
        }else if(T1.data == T2.data && MatchTree(T1, T2)) {
            return true;
        }
        return MatchTree(T1.leftChild, T2) || MatchTree(T1.rightChild, T2);
    }

    public boolean MatchTree(TreeNode n1, TreeNode n2) {
        if(n1 == null && n2 == null) {
            return true;
        }else if(n1 == null || n2 == null) {
            return false;
        }else if(n1.data != n2.data) {
            return false;
        }else {
           return MatchTree(n1.leftChild, n2.rightChild);
        }
    }

    public static void main(String[] args) {
        checkSubtreeSolution2 check = new checkSubtreeSolution2();
        TreeNode n1 = new TreeNode(12);
        TreeNode n2 = new TreeNode(8);
        System.out.println(check.containsTree(n1, n2));
    }
}
