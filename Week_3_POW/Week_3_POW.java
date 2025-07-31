import java.util.*;
public class Week_3_POW {

    //Question 1 => Equal Sum Partition.
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     ArrayList<Integer> list = new ArrayList<>(10);
    //     System.out.print("Enter a size of a List : ");
    //     int n = sc.nextInt();
    //     for(int i=0; i<n; i++){
    //         list.add(sc.nextInt());
    //     }
    //     System.out.println(canPartition(list));  
    // }

    // public static boolean canPartition(ArrayList<Integer> nums) {
    //     int totalSum = 0;
    //     for (int num : nums) {
    //         totalSum += num;
    //     }

    //     if (totalSum % 2 != 0) {
    //         return false;
    //     }

    //     int target = totalSum / 2;
    //     boolean[] dp = new boolean[target + 1];
    //     dp[0] = true;

    //     for (int num : nums) {
    //         for (int i = target; i >= num; i--) {
    //             dp[i] = dp[i] || dp[i - num];
    //         }
    //     }

    //     return dp[target];
    // }

    //Question 2 => Count Unival Subtrees.
    
    // static class Result {
    //     int count = 0;
    // }

    // public static int countUnivalSubtrees(TreeNode root) {
    //     Result result = new Result();
    //     isUnival(root, result);
    //     return result.count;
    // }

    // private static boolean isUnival(TreeNode node, Result result) {
    //     if (node == null) {
    //         return true;
    //     }

    //     boolean leftUnival = isUnival(node.left, result);
    //     boolean rightUnival = isUnival(node.right, result);

    //     if (!leftUnival || !rightUnival) {
    //         return false;
    //     }

    //     if (node.left != null && node.left.val != node.val) {
    //         return false;
    //     }

    //     if (node.right != null && node.right.val != node.val) {
    //         return false;
    //     }

    //     result.count++;
    //     return true;
    // }

    // public static void main(String[] args) {

    //     TreeNode root = new TreeNode(0);
    //     root.left = new TreeNode(1);
    //     root.right = new TreeNode(0);
    //     root.right.left = new TreeNode(1);
    //     root.right.right = new TreeNode(0);
    //     root.right.left.left = new TreeNode(1);
    //     root.right.left.right = new TreeNode(1);

    //     System.out.println("Total Unival Subtrees: " + countUnivalSubtrees(root));
    // }

    //Question 3 => Word Search in 2D Matrix.

    // public static boolean wordExists(char[][] matrix, String word) {
    //     int rows = matrix.length;
    //     int cols = matrix[0].length;

    //     for (int i = 0; i < rows; i++) {
    //         StringBuilder rowString = new StringBuilder();
    //         for (int j = 0; j < cols; j++) {
    //             rowString.append(matrix[i][j]);
    //         }
    //         if (rowString.toString().contains(word)) {
    //             return true;
    //         }
    //     }

    //     for (int j = 0; j < cols; j++) {
    //         StringBuilder colString = new StringBuilder();
    //         for (int i = 0; i < rows; i++) {
    //             colString.append(matrix[i][j]);
    //         }
    //         if (colString.toString().contains(word)) {
    //             return true;
    //         }
    //     }

    //     return false;
    // }

    // public static void main(String[] args) {
    //     char[][] matrix = {
    //         {'F', 'A', 'C', 'I'},
    //         {'O', 'B', 'Q', 'P'},
    //         {'A', 'N', 'O', 'B'},
    //         {'M', 'A', 'S', 'S'}
    //     };

    //     String word1 = "FOAM";
    //     String word2 = "MASS";
    //     String word3 = "FACE";

    //     System.out.println("FOAM: " + wordExists(matrix, word1));
    //     System.out.println("MASS: " + wordExists(matrix, word2)); 
    //     System.out.println("FACE: " + wordExists(matrix, word3));
    // }
}

// class TreeNode {
//     int val;
//     TreeNode left, right;

//     TreeNode(int val) {
//         this.val = val;
//     }
// }
