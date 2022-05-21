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
    int sum  = 0;
    public void traverse(TreeNode root, boolean flag)
    {
        if(root != null)
        {
            if(flag && root.left == null && root.right == null)
            {
                sum += root.val;   
            }
            
            traverse(root.left, true);
            traverse(root.right, false);
        }
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        traverse(root,false);
        return sum;
    }
}