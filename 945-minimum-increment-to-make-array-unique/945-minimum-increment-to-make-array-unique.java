class Solution {
    public int minIncrementForUnique(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int prevNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= prevNum) {
                prevNum++;
                count += (prevNum - nums[i]);
            } else {
                prevNum = nums[i];
            }
        }
        return count;
    }
}