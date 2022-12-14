class Solution {
    public int rob(int[] nums) {
        int t[] = new int[nums.length+1];
        Arrays.fill(t,-1);
        return rob(nums, nums.length-1, t);
    }
    public int rob(int[] nums, int i, int[] t)
    {
        if(i < 0)
            return 0;
        if(t[i] != -1)
            return t[i];
        return t[i] = Math.max(rob(nums, i-1, t), rob(nums, i-2, t)+nums[i]);
    }
}