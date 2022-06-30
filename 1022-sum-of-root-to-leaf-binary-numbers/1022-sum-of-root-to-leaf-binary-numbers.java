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
    StringBuilder sb = new StringBuilder();
    int sum = 0;
    public void dfs(TreeNode root)
    {
        if(root == null)
            return;
        sb.append(root.val);
        if(root.left == null && root.right == null)
        {
            sum += Integer.parseInt(sb.toString(),2); 
        }
        dfs(root.left);
        dfs(root.right);
        if (sb.length() > 0)
            sb.setLength(sb.length() - 1);
    }
    public int sumRootToLeaf(TreeNode root) {
        dfs(root);  
        return sum;
    }
}