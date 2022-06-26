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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newnode = new TreeNode(val);
        if(root == null)
            return newnode;
        TreeNode cpy=root, pre = null;
        while(root!=null)
        {
            pre = root;
            root = val<root.val ? root.left : root.right;
        }
        if(pre.val < val)
            pre.right = newnode;
        else
            pre.left = newnode;
        return cpy;
    }
}