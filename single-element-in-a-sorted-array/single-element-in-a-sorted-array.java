class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2])
            return nums[nums.length-1];
        for(int i =0; i<nums.length-1; i+=2)
        {
            int j = i+1;
                if(nums[i]!=nums[j])
                {
                    return nums[i];
                }
        }
        return -1;
    }
}