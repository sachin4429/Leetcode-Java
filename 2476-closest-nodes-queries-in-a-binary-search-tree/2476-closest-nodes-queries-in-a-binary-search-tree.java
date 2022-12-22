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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = inorderTraversal(root);
        for(int i : queries)
        {
            int res = search(arr,i);
            List<Integer> inner = new ArrayList<>();
            if(res!=-1)
            {
                inner.add(i);
                inner.add(i);
            }
            else
            {
               int r = lb (arr, i);
            int l = ub (arr, i);
            if(l == arr.size()){
                inner.add(-1);
            }
            else{
                inner.add(arr.get(l));
            }
            if(r == arr.size()){
                inner.add(-1);
            }
            else{
                inner.add(arr.get(r));
            }
            }
            ans.add(inner);
        }
        return ans;
    }
    public int search(List<Integer> nums, int target) {
        int lo =0, hi =nums.size()-1;
        while(hi>=lo)
        {
            int mid = lo + (hi-lo)/2;
            if(nums.get(mid) > target)
                hi = mid-1;
            else if(nums.get(mid) < target)
                lo = mid+1;
            else
                return nums.get(mid);
        }
        return -1;
    }
    public int lb(List<Integer> l, int x){
        int i = 0;
        int j = l.size()-1;
        int res = l.size();
        while(i <= j){
            int mid=(i + j)/2;
            if(l.get(mid) >= x){
                res = mid;
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return res;
    }
    public int ub(List<Integer> l, int x){
        int i = 0;
        int j = l.size()-1;
        int res = l.size();
        while(i <= j){
            int mid = (i + j)/2;
            if(l.get(mid) <= x){
                i = mid+1;
                res = mid;
            }
            else{                
                j=mid-1;
            }
        }
        return res;
    }
    public int[] reSearch(List<Integer> nums, int target) {
        int[] res = new int[2];
        int lo =0, hi =nums.size()-1;
        while(hi>lo)
        {
            int mid = lo + (hi-lo)/2;
            if(nums.get(mid) > target)
                hi = mid-1;
            else if(nums.get(mid) < target)
                lo = mid+1;
        }
        res[0] = nums.get(lo);
        res[1] = nums.get(hi);
        if(target<nums.get(0))
            res[0] = -1;
        if(target>nums.get(nums.size()-1))
            res[1] = -1;
        return res;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<>();
        while(true)
        {
            if(root != null)
            {
                s.push(root);
                root = root.left;
            }
            else
            {
                if(s.isEmpty())
                    break;
                root = s.pop();
                ans.add(root.val);
                root = root.right;
            }
        }
        return ans;
    }
}