class Solution {
    public void sortColors(int[] nums) {
        int r = 0, w = 0, b = 0;
        for(int n : nums)
        {
            if(n == 0)
                r++;
            else if(n == 1)
                w++;
            else if(n == 2)
                b++;
        }
            for(int i = 0; i<nums.length; i++)
            {
                if(i<r)
                    nums[i] = 0;
                else if(i<r+w)
                    nums[i] = 1;
                else
                    nums[i] = 2;
            }
            
    }
}