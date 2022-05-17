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
    public TreeNode BST(int[] num, int start, int end) {
        if(end<start) return null;
        int mid = start +(end-start)/2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = BST(num,start,mid-1);
        node.right = BST(num,mid+1,end);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return BST(nums,0,nums.length-1);
    }
}