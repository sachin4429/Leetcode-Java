class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> ds = new ArrayList<Integer>();
        boolean check[] = new boolean[nums.length];
        recursivefun(nums, ans, ds, check);
        return ans;
    }
    public void recursivefun(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean check[])
    {
        if(ds.size() == nums.length)
        {
            ans.add( new ArrayList<>(ds)); 
            return;
        }
        for(int i = 0; i<nums.length; i++)
        {
            if(check[i] == false)
            {
                check[i] = true;
                ds.add(nums[i]);
                recursivefun(nums, ans, ds, check);
                check[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
}