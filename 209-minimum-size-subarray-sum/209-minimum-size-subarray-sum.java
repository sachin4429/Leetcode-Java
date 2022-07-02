class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE, sum = 0;
        for(int i = 0, j= 0; i<nums.length; i++)
        {
            sum+= nums[i];
            while(sum>=target)
            {
                ans = Math.min(ans,i-j+1);
                sum-=nums[j++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}