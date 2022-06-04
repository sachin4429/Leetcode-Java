class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int pro0 = 1;
        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
            pro *= nums[i];
            if(nums[i] == 0)
            {
                count ++;
            }
            if(nums[i] != 0)
            {
                pro0 *= nums[i];
            }
            if(count>1)
            {
                pro0 = 0;
                break;
            }
        }
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] != 0 )
                nums[i] = pro/nums[i];
            else
                nums[i] = pro0;
        }
        return nums;
    }
}