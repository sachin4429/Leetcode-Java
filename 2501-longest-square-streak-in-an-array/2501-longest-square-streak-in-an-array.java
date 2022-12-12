class Solution {
    public int longestSquareStreak(int[] nums) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i : nums)
        {
            set.add(i);
        }
        int ans = -1;
        while(!set.isEmpty())
        {
            int s = 1;
            int f = set.first();
            int next = f*f;
            while(set.contains(next))
            {
                s++;
                next *=next;
            }
            ans = Math.max(s,ans);
            set.remove(set.first());
        }
        if(ans == 1)
            return -1;
        else
            return ans;
    }
}