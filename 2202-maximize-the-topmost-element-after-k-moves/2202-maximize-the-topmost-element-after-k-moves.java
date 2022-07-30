class Solution {
    public int maximumTop(int[] nums, int k) {
        int N = nums.length;
        if(k == 0) return N>=1 ? nums[0] : -1;
        if(k == 1) return N==1 ? -1 : nums[1];
        if(N == 1) return k%2==0 ? nums[0] : -1;
        int max = -1;
        for(int i = 0; i<Math.min(k-1,N); i++)
        {
            max = Math.max(max, nums[i]);
        }
        if(k < N)
            max = Math.max(max, nums[k]);
        return max;
    }
}