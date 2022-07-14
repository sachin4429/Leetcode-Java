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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        TreeNode root=buildtree(preorder,0,preorder.length-1,inorder,0,inorder.length,map);
        
        return root;
    }
    
    public TreeNode buildtree(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd,HashMap<Integer,Integer> map){
        if(preStart>preEnd || inStart>inEnd)
            return null;
        
        TreeNode root=new TreeNode(preorder[preStart]);
        int pos=map.get(root.val);
        int l=pos-inStart;
        
        root.left=buildtree(preorder,preStart+1,preStart+l,inorder,inStart,pos-1,map);
        root.right=buildtree(preorder,preStart+l+1,preEnd,inorder,pos+1,inEnd,map);
        
        return root;
    }
}