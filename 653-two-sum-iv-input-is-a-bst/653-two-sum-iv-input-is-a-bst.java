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
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int lo  = 0, hi = arr.size()-1;
        while(lo<hi)
        {
            if(arr.get(lo)+arr.get(hi) == k)
                return true;
            else if(arr.get(lo)+arr.get(hi) < k)
                lo++;
            else 
                hi--;
        }
        return false;
    }
    public void inorder(TreeNode root)
    {
        if(root == null)
            return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
}