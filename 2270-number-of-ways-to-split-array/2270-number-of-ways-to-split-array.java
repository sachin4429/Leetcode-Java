class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        for(int i : nums)
            sum += i;
        long forwardSum = 0;
        int count = 0;
        for(int i = 0; i<nums.length-1; i++)
        {
            forwardSum += nums[i];
            sum -= nums[i];
            if(forwardSum >= sum)
                count++;
        }
        return count;
    }
}