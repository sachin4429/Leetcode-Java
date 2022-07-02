class Solution {
    public int[] getAverages(int[] nums, int k) {
        int res[] = new int[nums.length];
        Arrays.fill(res,-1);
        if(nums.length<2*k+1)
            return res;
        long sum = 0;
        for(int i = 0; i<2*k+1; i++)
            sum+=(nums[i]%1000000000);
        for(int i = k, j = 0; i<nums.length-k; i++)
        {
            if(i == k)
                res[i] = (int)(sum/(2*k+1))%1000000000;
            else
            {
                sum = sum + nums[i+k] - nums[j++];
                res[i] = (int)(sum/(2*k+1))%1000000000;
            }
        }
        return res;
    }
}