class Solution {
    public void sortColors(int[] nums) {
        int lo =0, mid = 0, hi = nums.length-1;
        while(mid<=hi)
        {
            if(nums[mid] == 0)
            {
                if(mid!=lo)
                    swap(nums,mid,lo);
                mid++;
                lo++;
            }
            else if(nums[mid] == 2)
            {
                if(mid!=hi)
                    swap(nums,mid,hi);
                hi--;
            }
            else
                mid++;
        }
    }
    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}