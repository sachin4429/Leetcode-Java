class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0, right = 0, n = nums.length, len = 0;
        while(right<n)
        {
            if(nums[right] == 0)
            {
                left = right+1;
                right = left;
                continue;
            }
            right++;
            len = Math.max(len, right-left);
        }
        return len;
    }
}