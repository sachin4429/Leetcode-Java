/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res = 0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return res;
    }
    public int[] dfs(TreeNode root)
    {
        int sum = root.val;
        int numOfNodes = 1;

        if (root.left != null) 
        {
            int[] left = dfs(root.left);
            sum += left[0];
            numOfNodes += left[1];
        }
        
        if (root.right != null) 
        {
            int[] right = dfs(root.right);
            sum += right[0];
            numOfNodes += right[1];
        }

        if (sum / numOfNodes == root.val) 
        {
            res++;
        }

        return new int[] {sum, numOfNodes};
    }
}