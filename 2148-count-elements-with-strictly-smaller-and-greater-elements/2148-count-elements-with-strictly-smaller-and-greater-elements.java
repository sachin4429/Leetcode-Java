class Solution {
    public int countElements(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i : nums)
        {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        int count = 0;
        for(int i : nums)
        {
            if(i != min && i != max)
                count++;
        }
        return count;
    }
}