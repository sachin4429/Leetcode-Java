class Solution {
    public int jump(int[] nums) {
        var current = 0;
        var farthest = 0;
        var jumps = 0;
        for(var i = 0; i<nums.length-1; i++)
        {
            farthest = Math.max(farthest, nums[i]+i);
            if(i == current)
            {
                current = farthest;
                jumps ++; 
            }
        }
        return jumps;
    }
}