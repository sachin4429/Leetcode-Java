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
    List<Integer> res;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = new ArrayList<Integer>();
        List<Integer> r2 = new ArrayList<Integer>();
        inorder(root1, r1);
        inorder(root2, r2);
        res = new ArrayList<Integer>();
        merge(r1, r2);
        return res;
    }
    public void inorder(TreeNode root, List<Integer> r)
    {
        if(root == null)
            return;
        inorder(root.left, r);
        r.add(root.val);
        inorder(root.right, r);
    }
    public void merge(List<Integer> r1, List<Integer> r2)
    {
        int i = 0, j = 0;
        while(r1.size() > i && r2.size() > j)
        {
            if(r1.get(i) <= r2.get(j))
            {
                res.add(r1.get(i));
                i++;
            }
            else
            {
                res.add(r2.get(j));
                j++;
            }
        }
        while(r1.size() > i)
        {
            res.add(r1.get(i));
            i++;
        }
        while(r2.size() > j)
        {
            res.add(r2.get(j));
            j++;
        }
            
    }
}