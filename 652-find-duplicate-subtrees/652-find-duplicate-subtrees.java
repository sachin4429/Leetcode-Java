class Solution {
    List<TreeNode> res;
    Map<String, Integer> map;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        res = new ArrayList<>();
        map = new HashMap<>();
        postOrder(root);
        return res;
    }
    
    private String postOrder(TreeNode node){
        if(node == null)
            return "N";
        String left = postOrder(node.left);
        String right = postOrder(node.right);
        String cur = node.val +" "+left+" "+right;
        map.put(cur, map.getOrDefault(cur, 0)+1);
        if(map.get(cur) == 2)
            res.add(node);
        return cur;
    }   
}