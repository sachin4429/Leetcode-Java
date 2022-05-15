class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int count = 1, maxcount = 1;
        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i] != nums[i+1])
            {
                if(nums[i] == (nums[i+1]-1))
            {
                count++;
            }
            else
            {
                maxcount = Math.max(maxcount, count);
                count = 1;
            }
            }
        }
        maxcount = Math.max(maxcount, count);
        return maxcount;
    }
}

