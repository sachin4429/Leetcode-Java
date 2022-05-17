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
    boolean res = true;
    Integer prev = null;
    public void traversal(TreeNode root)
    {
        if(root == null)
            return;
        traversal(root.left);
        if(prev != null && root.val <= prev)
        {
            res = false;
            return;
        }
        prev = root.val;
        traversal(root.right);
    }
    public boolean isValidBST(TreeNode root) 
    {
        traversal(root);
        return res;
    }
}