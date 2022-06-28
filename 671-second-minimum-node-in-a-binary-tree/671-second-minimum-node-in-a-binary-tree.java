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
    int ref = 0;
    long ans = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        ref = root.val;
        while(!q.isEmpty())
        {
            int level = q.size();
            for(int i = 0; i<level; i++)
            {
                if(q.peek().left != null)
                    q.add(q.peek().left);
                if(q.peek().right != null)
                    q.add(q.peek().right);
                if(q.peek().val>ref)
                    ans = Math.min(ans, q.poll().val);
                else
                    q.poll();
                    
            }
        }
        
            if(ans!=Long.MAX_VALUE)
                return (int)ans;
            return -1;
    }
}