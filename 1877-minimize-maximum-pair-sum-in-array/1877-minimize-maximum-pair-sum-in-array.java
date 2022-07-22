class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i = 0, j = nums.length-1; i<nums.length/2; i++, j--)
        {
            res = Math.max(res, nums[i]+nums[j]);
        }
        return res;
    }
}