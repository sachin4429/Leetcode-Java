class Solution {
    public int pivotIndex(int[] nums) {
        long sum = 0;
        for(int i : nums)
        {
            sum += i;
        }
        long leftsum = 0;
        for(int i = 0; i<nums.length; i++)
        {
            sum -= nums[i];
            if(leftsum == sum)
                return i;
            leftsum += nums[i];
        }
        return -1;
    }
}