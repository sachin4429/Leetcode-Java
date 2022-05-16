class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentcount = 0, maxcount = 0;
        for(int i : nums)
        {
            if(i == 0)
            {
                maxcount = Math.max(maxcount, currentcount);
                currentcount = 0;
            }
            else  
                currentcount++;
        }
        return Math.max(maxcount, currentcount);
    }
}