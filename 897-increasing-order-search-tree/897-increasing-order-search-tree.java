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
        TreeNode froot = new TreeNode();
    public TreeNode increasingBST(TreeNode root) {
        TreeNode res = froot;
        inorder(root);
        return res.right;
        
    }
    public void inorder(TreeNode root)
    {
        if(root == null)
            return;
        inorder(root.left);
        froot.right = new TreeNode(root.val);
        froot = froot.right;
        inorder(root.right);
    }
}