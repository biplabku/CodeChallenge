import java.util.ArrayList;

public class PathsWithSum {



    public int pathWithSum(TreeNode node, int targetSum) {
        if(node == null) {
            return 0;
        }

        int countFromRoot = countPathsFromRoot(node, targetSum, 0) ;

        int leftPaths = pathWithSum(node, targetSum);
        int rightPaths = pathWithSum(node, targetSum);

        int total  = countFromRoot + leftPaths + rightPaths;
        return total;
    }


    public int countPathsFromRoot(TreeNode node, int target, int currentSum) {
        if(node == null) {
            return 0;
        }
        currentSum = currentSum + node.data;
        int totalPaths = 0;
        if(currentSum == target) {
            totalPaths++;
        }
        totalPaths = totalPaths + countPathsFromRoot(node.leftChild, target, currentSum);
        totalPaths  = totalPaths + countPathsFromRoot(node.rightChild, target, currentSum);
        return totalPaths;
    }

    public static void main(String[] args) {

    }
}
