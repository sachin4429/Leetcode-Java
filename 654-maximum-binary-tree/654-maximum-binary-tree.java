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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length-1);
    }
    public TreeNode buildTree(int[]nums, int si, int ei)
    {
        if(si>ei)
            return null;
        int max = findMax(nums, si, ei);
        TreeNode root = new TreeNode(nums[max]);
        root.left = buildTree(nums,si,max-1);
        root.right = buildTree(nums,max+1,ei);
        return root;
    }
    public int findMax(int[] nums, int si, int ei)
    {
        int max = Integer.MIN_VALUE;
        int ind = 0;
        for(int i = si; i<=ei; i++)
            if(max<nums[i])
            {
                max = nums[i];
                ind = i;
            }
        return ind;
    }
}