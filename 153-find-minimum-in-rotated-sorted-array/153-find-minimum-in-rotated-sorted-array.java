class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int x : nums)
        {
            if(x<min)
                min = x;
        }
        return min;
    }
}