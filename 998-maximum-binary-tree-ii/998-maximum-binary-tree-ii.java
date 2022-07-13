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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root == null)
            return null;
        inorder(root);
        arr.add(val);
        return buildTree(arr, 0, arr.size()-1);
        
    }
    public void inorder(TreeNode root)
    {
        if(root == null)
            return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    public TreeNode buildTree(ArrayList<Integer> arr, int si, int ei)
    {
        if(si>ei)
            return null;
        int max = findMax(arr, si, ei);
        TreeNode root = new TreeNode(arr.get(max));
        root.left = buildTree(arr,si,max-1);
        root.right = buildTree(arr,max+1,ei);
        return root;
    }
    public int findMax(ArrayList<Integer> arr, int si, int ei)
    {
        int max = Integer.MIN_VALUE;
        int ind = 0;
        for(int i = si; i<=ei; i++)
            if(max<arr.get(i))
            {
                max = arr.get(i);
                ind = i;
            }
        return ind;
    }
}