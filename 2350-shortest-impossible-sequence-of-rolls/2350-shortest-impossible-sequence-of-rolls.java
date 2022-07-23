class Solution {
    public int shortestSequence(int[] rolls, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 1;
        for(int i : rolls)
        {
            set.add(i);
            if(set.size() == k)
            {
                count++;
                set.clear();
            }
        }
        return count;
    }
}