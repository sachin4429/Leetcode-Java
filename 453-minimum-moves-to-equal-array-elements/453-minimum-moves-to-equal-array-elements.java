class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int min = nums[0];
        for(int i : nums)
            min = Math.min(min,i);
        for(int i : nums)
            count += i-min;
        return count;
    }
}