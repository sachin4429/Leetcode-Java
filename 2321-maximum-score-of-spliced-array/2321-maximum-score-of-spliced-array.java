class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int n = nums1.length, sum1 = 0, sum2 = 0;
        int[] dif1 = new int[n];
        int[] dif2 = new int[n];
        for(int i =0; i<n; i++)
        {
            dif1[i] = nums1[i] - nums2[i];
            dif2[i] = nums2[i] - nums1[i];
            sum1 += nums1[i];
            sum2 += nums2[i];
        }
        int max1 = kadaneAlgo(dif1);
        int max2 = kadaneAlgo(dif2);
        return Math.max(sum1+max2,sum2+max1);
        
    }
    public int kadaneAlgo(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : nums)
        {
            sum+=i;
            max = Math.max(max,sum);
            if(sum<0)
                sum = 0;
        }
        return max;
    }
}