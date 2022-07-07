class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int res[] = new int[n];
        int ind = 0;
        for(int i : spells)
        {
            int lo = 0, hi = m-1;
            while(lo<=hi)
            {
                int mid = lo + (hi-lo)/2;
                if((long)i*potions[mid] >= success)
                    hi = mid-1;
                else
                    lo = mid +1;
            }

            
             res[ind++] = m-lo;
        }
        return res;
    }
}