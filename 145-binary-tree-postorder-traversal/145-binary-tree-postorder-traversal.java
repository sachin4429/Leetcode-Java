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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans =  new ArrayList<>();
        if(root == null)
            return ans;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {
            root = s.pop();
            ans.add(0, root.val);
            if(root.left != null)
                s.push(root.left);
            if(root.right != null)
                s.push(root.right);
        }
        return ans;
    }
}