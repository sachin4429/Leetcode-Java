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
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public void traversal(TreeNode root)
    {
        if(root == null)
            return;
        traversal(root.left);
        arr.add(root.val);
        traversal(root.right);
    }
    public boolean isValidBST(TreeNode root) 
    {
        traversal(root);
        if(arr.size()<=1)
            return true;
        for(int i = 1; i<arr.size(); i++)
        {
            if(arr.get(i)<=arr.get(i-1))
                return false;
        }
        return true;
    }
}