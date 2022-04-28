class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int sum = 0, min = Integer.MAX_VALUE, res = 0;
        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                for(int k = j+1; k<n; k++)
                {
                    sum = nums[i]+nums[j]+nums[k];
                   if(Math.abs(target-sum)< min)
                   {
                       min = Math.abs(target-sum);
                       res = sum;
                   }
                }
            }
        }
        return res;
    }
}