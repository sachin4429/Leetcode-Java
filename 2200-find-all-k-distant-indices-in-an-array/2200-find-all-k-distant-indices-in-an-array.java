class Solution {
    TreeSet<Integer> set = new TreeSet<Integer>();
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == key)
                add(i,k,nums.length-1);
        }
        return new ArrayList<>(set);
    }
    public void add(int i, int k, int n)
    {
        int lo = Math.max(0, i-k);
        int hi = Math.min(n, i+k);
        for(int j = lo; j<=hi; j++)
            set.add(j);
    }
}