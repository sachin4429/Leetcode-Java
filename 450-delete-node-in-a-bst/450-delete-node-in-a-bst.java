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
    public void deleteleft(TreeNode pre, TreeNode root)
    {
        if(root.left == null && root.right == null)
                    pre.left = null;
                else if(root.left == null)
                    pre.left = root.right;
                else if(root.right == null)
                    pre.left = root.left;
                else
                {
                    pre.left = root.right;
                    while(pre.left != null)
                        pre = pre.left;
                    pre.left = root.left;
                }
    }
    public void deleteright(TreeNode pre, TreeNode root)
    {
        if(root.left == null && root.right == null)
                    pre.right = null;
                else if(root.left == null)
                    pre.right = root.right;
                else if(root.right == null)
                    pre.right = root.left;
                else
                {
                    pre.right = root.left;
                    while(pre.right != null)
                        pre = pre.right;
                    pre.right = root.right;
                }
    }
    public TreeNode deleteNode(TreeNode root, int val) {
        TreeNode pre = null, cpy = root;
        while(root!=null && root.val != val)
        {   pre = root;
            root = val<root.val ? root.left : root.right;
        }
        if(root == null)
            return cpy;
        else if(pre == null && root.right == null && root.left == null)
            return null;
        else
        {
            if(pre == null) // if root to be deleated;
            {
                TreeNode pseudopre = new TreeNode();
                pseudopre.val = Integer.MAX_VALUE;
                pseudopre.left = root;
                pre = pseudopre;
                deleteleft(pre, root);
                return pseudopre.left;
                
            }
                
            
            if(root.val<pre.val) // left
            {
                deleteleft(pre, root);
            }
            else
            {
                deleteright(pre,root);
            }
                
        }
        return cpy;
    }
}