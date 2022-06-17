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
    int moniterd = -1, isCamera = 0, needCamera = 1, count = 0;
    public int minCameraCover(TreeNode root) {
        int cameraInfo = cameraNodeInfo(root);
        if(cameraInfo == needCamera)
            return count+1;
        return count;
    }
    int cameraNodeInfo(TreeNode root)
    {
        if(root == null)
            return moniterd;
        int left = cameraNodeInfo(root.left);
        int right = cameraNodeInfo(root.right);
        if(left == needCamera || right == needCamera){
            count++;
            return isCamera;
        }
      
        else if (left == isCamera || right == isCamera) return moniterd;
        
		
        return needCamera;
        
    }
}