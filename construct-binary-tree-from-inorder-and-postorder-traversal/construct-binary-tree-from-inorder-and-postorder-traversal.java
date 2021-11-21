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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return createTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }
    private static TreeNode createTree(int[] inorder, int inLow, int inHigh, int[] postorder, int postLow, int postHigh, Map<Integer, Integer> map){
        if(inLow > inHigh || postLow > postHigh) return null;
        int val = postorder[postHigh];
        TreeNode cur = new TreeNode(val);
        int pos = map.get(val);
        int len = inHigh - pos;
        cur.right = createTree(inorder, pos + 1, inHigh, postorder, postHigh - len, postHigh - 1, map);
        cur.left = createTree(inorder, inLow, pos - 1, postorder, postLow, postHigh - len - 1, map);
        return cur;
    }
}