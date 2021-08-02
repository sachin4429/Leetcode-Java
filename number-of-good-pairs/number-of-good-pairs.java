class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] freq = new int[101];
        for(int num : nums)
            count += freq[num]++;
        return count;
    }
}