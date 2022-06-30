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
    class Pair
    {
        TreeNode node;
        int data;
        Pair(TreeNode node, int data)
        {
            this.node = node;
            this.data = data;
        }
    }
    ArrayList<Pair> arr = new ArrayList<Pair>();
    public void inorder(TreeNode root)
    {
        if(root == null)
            return;
        inorder(root.left);
        arr.add(new Pair(root, root.val));
        inorder(root.right);
    }
    public TreeNode convertBST(TreeNode root)
    {
        if(root == null || (root.left == null && root.right == null))
            return root;
        
        inorder(root);
        int last = arr.get(arr.size()-1).data;
        for(int i = arr.size()-2; i>=0; i--)
        {
            arr.get(i).node.val += last;
            last = arr.get(i).node.val;
        }
        return root;
    }
}