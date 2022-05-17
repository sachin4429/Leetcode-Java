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
    TreeNode pre = null;
    TreeNode n1, n2;
    public void traversal(TreeNode root)
    {
        if(root == null)
            return;
        traversal(root.left);
        if(pre != null)
        {
            if (root.val <= pre.val) 
            {
                if (n1 == null) 
                {
                    n1 = pre;
                    n2 = root;
                }
                else
                    n2 = root;
            }
        }
        pre = root;
        traversal(root.right);
    }
    public void recoverTree(TreeNode root) {
        traversal(root);
        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;
    }
}