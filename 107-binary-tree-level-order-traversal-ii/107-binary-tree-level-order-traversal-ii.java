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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> innerRes = new ArrayList<Integer>();
            int level = q.size();
            for(int i = 0; i<level; i++)
            {
                if(q.peek().left != null)
                    q.add(q.peek().left);
                if(q.peek().right != null)
                    q.add(q.peek().right);
                innerRes.add(q.poll().val);
            }
            res.add(0,innerRes);
        }
        return res;
    }
}