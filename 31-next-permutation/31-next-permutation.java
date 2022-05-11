class Solution {
    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int i)
    {
        int j = nums.length-1;
        while(i<j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        if(nums.length <= 1)
            return;
        int i = 0;
        for(i = nums.length-2; i>=0; i--)
        {
            if(nums[i]<nums[i+1])
            {
                for(int j = nums.length-1; j>=0; j--)
                {
                    if(nums[j]>nums[i])
                    {
                        swap(nums,i,j);
                        break;
                    }
                }
                reverse(nums,i+1);
                break;
            }
        }
        if(i == -1)
        {
            reverse(nums,0);
        }
    }
}