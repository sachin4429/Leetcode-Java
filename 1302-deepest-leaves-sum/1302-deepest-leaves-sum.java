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
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
        
    }
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        int height = height(root);
        LeavesSum(root, 1, height);
        return sum;
    }
    public void LeavesSum(TreeNode root, int cur, int height) {
        if(root != null)
        {
            if(cur == height)
                sum += root.val;
            LeavesSum(root.left, cur+1, height);
            LeavesSum(root.right, cur+1, height);
        }
        
    }
}