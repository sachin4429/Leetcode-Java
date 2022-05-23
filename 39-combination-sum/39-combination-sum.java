class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<Integer>();
        combi(0,candidates,target,ans,curr);
        return ans;
    }
    public void combi(int index, int[] can, int target, List<List<Integer>> ans, List<Integer> curr)
    {
        if(index == can.length)
        {
            if(target == 0)
                ans.add(new ArrayList<>(curr));
            return;
        }
        if(can[index] <= target)
        {
            curr.add(can[index]);
            combi(index, can, target-can[index], ans, curr);
            curr.remove(curr.size()-1);
        }
        combi(index+1, can, target, ans, curr);
    }
}