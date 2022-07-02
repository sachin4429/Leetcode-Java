class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        for(int i = 0; i<k; i++)
            sum+= nums[i];
        if(k==nums.length)
            return sum/k;
        double maxsum = sum;
        for(int i = k, j = 0; i<nums.length; i++)
        {
            double newSum = sum + nums[i] - nums[j++];
            if(newSum > maxsum)
                maxsum = newSum;
            sum = newSum;
            
        }
        return maxsum/k;
    }
}