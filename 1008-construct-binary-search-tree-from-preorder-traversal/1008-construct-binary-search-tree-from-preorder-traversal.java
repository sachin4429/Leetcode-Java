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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode head = new TreeNode(preorder[0]);
        stack.push(head);
        for(int i=1; i<n; i++){
            TreeNode prev=null;
            while(!stack.isEmpty() && stack.peek().val<preorder[i]){
                prev = stack.pop();
            }
            if(prev==null){
                TreeNode left = new TreeNode(preorder[i]);
                stack.peek().left = left;
                stack.push(left);
            }
            else{
                TreeNode right = new TreeNode(preorder[i]);
                prev.right = right;
                stack.push(right);
            }
        }
        return head;
    }
}