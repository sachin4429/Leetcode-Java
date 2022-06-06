class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i : nums)
        {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        if(min == max) return 0;
        int Count = 0;
        for(int j : nums)
        {
            if(min != j && max != j)
                Count++;
        }
        return Count;
    }
}