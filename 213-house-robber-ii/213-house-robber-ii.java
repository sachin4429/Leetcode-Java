class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int t1[] = new int[nums.length+1];
        int t2[] = new int[nums.length+1];
        Arrays.fill(t1,-1);
        Arrays.fill(t2,-1);
    return Math.max(rob(nums, 0, nums.length - 2, t1), rob(nums, 1, nums.length - 1, t2));
    }
    public int rob(int[] nums, int start, int i, int[] t)
    {
        if(i < start)
            return 0;
        if(t[i] != -1)
            return t[i];
        return t[i] = Math.max(rob(nums, start, i-1, t), rob(nums, start, i-2, t)+nums[i]);
    }
}