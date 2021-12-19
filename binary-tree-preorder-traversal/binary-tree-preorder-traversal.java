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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<Integer>();
        preorder(root, ll);
        return ll;
    }
    public static void preorder(TreeNode root, List<Integer> ll)
    {
        if(root == null)
        {
            return;
        }
        ll.add(root.val);
        preorder(root.left, ll);
        preorder(root.right, ll);
        //System.out.println(root.val);
    }
}