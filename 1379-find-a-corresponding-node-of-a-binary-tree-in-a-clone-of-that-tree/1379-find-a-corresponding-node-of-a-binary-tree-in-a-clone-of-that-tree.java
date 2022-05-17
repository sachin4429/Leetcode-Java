/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public static void inorder(TreeNode root, int k)
    {
        if(root == null)
            return;
        if(root.val == k)
            res = root;
        inorder(root.right,k);
        inorder(root.left,k);
    }
    static TreeNode res = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inorder(cloned,target.val);
        return res;
    }
}