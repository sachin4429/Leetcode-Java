class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<Integer>();
        ans.add(curr);
        for(int i : nums)
        {
            int control = ans.size();
            for(int j = 0; j<control; j++)
            {
                curr = new ArrayList<Integer>(ans.get(j));
                curr.add(i);
                ans.add(curr);
            }
        }
        return ans;
    }
}