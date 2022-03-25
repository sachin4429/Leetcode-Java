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
    public static void swap(TreeNode node)
    {
        if(node == null)
            return;
        swap(node.left);
        swap(node.right);
        TreeNode temp;
        temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
}