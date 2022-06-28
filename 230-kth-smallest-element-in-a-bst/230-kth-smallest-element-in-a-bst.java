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
    int result = 0;
    int itr = 0;
    public int kthSmallest(TreeNode root, int k) {
        itr = k;
        inorder(root);
        return result;
        
    }
    public void inorder(TreeNode root)
    {
        if(root == null)
            return;
        inorder(root.left);
        itr--;
        if(itr == 0)
            result = root.val;
        inorder(root.right);
    }
}