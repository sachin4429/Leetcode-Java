class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> srr = new HashSet<Integer>();
        for(int i : nums)
        {
            srr.add(i);
        }
        while(srr.contains(original))
        {
            original *= 2;
        }
        return original;
    }
}