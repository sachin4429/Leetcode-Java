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
    boolean ans = false;
    public void inorder(TreeNode root, int k)
    {
        if(root == null)
            return;
        if(root.val == k && root.left == null && root.right == null)
        {
            ans = true;
            return;
        }
        inorder(root.right,k-root.val);
        inorder(root.left,k-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        inorder(root,targetSum);
        return ans;
    }
}