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
    HashMap<Integer, Integer> left = new HashMap<>();
    HashMap<Integer, Integer> right = new HashMap<>();
    public TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode root = createRoot(descriptions);
        createMap(descriptions);
        //System.out.println(left+" "+right);
        createTree(root);
        return root;
    }
    public void createMap(int[][] descriptions)
    {
        for(int i[] : descriptions)
        {
            if(i[2] == 1)
                left.put(i[0],i[1]);
            else
                right.put(i[0],i[1]);
        }
    }
    public TreeNode createRoot(int[][] descriptions)
    {
        Set<Integer> np = new HashSet<>();
        for(int i[] : descriptions)
        {
            np.add(i[1]);
        }
        for(int i[] : descriptions)
        {
            if(!np.contains(i[0]))
            {
                return new TreeNode(i[0]);
            }
        }
        return null;
    }
    public void createTree(TreeNode root)
    {
        if(root == null)
            return;
        if(left.containsKey(root.val))
            root.left = new TreeNode(left.get(root.val));
        if(right.containsKey(root.val))
            root.right = new TreeNode(right.get(root.val));
        createTree(root.left);
        createTree(root.right);
    }
}