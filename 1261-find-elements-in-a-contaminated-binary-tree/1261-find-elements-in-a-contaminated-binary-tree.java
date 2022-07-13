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
class FindElements {
    HashSet<Integer> set = new HashSet<Integer>();
    public FindElements(TreeNode root) {
        root.val = 0;
        dfs(root);
    }
    public void dfs(TreeNode root)
    {
        if(root == null)
            return;
        
        set.add(root.val);
        if(root.left!=null)
        {
            root.left.val = root.val*2 + 1;
            dfs(root.left);
        }if(root.right!=null)
        {
            root.right.val = root.val*2 + 2;
            dfs(root.right);
        }
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */