class Solution {
    public int partitionArray(int[] nums, int k) {
        if(nums.length <2 )
            return nums.length;
        Arrays.sort(nums);
        int l = nums.length-1, ans = 0;
        for(int i = nums.length-2; i>=0; i--)
        {
            if(nums[l] - nums[i] > k)
            {
                ans++;
                l = i;
            }
        }
        return ans+1;
    }
}