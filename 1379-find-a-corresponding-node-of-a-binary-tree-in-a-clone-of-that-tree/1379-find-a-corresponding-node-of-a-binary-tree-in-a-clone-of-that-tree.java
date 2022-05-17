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
    public TreeNode getTargetCopy(TreeNode original, TreeNode cloned, TreeNode target) {
        if(target == original)
            return cloned;
        if(original == null)
            return null;
        TreeNode node = getTargetCopy(original.left, cloned.left, target);
        if(node!=null)
            return node;
        node = getTargetCopy(original.right, cloned.right, target);
        return node;
    }   
}