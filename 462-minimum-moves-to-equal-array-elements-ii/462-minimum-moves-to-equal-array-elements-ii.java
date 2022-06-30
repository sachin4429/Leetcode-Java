class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        int res = 0;
        for(int i : nums)
        {
            res += Math.abs(i-mid);
        }
        return res;
    }
}