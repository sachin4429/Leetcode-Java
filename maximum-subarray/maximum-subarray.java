class Solution {
    public int maxSubArray(int[] nums) {
        int m = nums[0];
        int c = nums[0];
        
        for(int i=1;i<nums.length;i++) {
            c = Math.max(c + nums[i], nums[i]);
            m = Math.max(m, c);
        }
        
        return m;
    }
}