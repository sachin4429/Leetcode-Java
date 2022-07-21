class Solution {
    public int minimumAverageDifference(int[] nums) {
        long min = Long.MAX_VALUE;
        int res = -1;
        int n = nums.length;
        long sum = 0;
        for(int i : nums)
            sum += i;
        long preSum = 0;
        for(int i = 0; i<n-1; i++)
        {
            preSum += nums[i];
            sum -= nums[i];
            if(min>Math.abs(preSum/(i+1)-sum/(n-i-1)))
            {
                res = i;
                min = Math.abs(preSum/(i+1)-sum/(n-i-1));
            }
        }
            preSum += nums[n-1];
            if(min>preSum/n)
            {
                return n-1;
            }
        return res;
    }
}