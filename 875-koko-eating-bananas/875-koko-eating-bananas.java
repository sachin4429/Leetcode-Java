class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        //    int left = 1, right =Arrays.stream(piles).max().getAsInt();
        // while (left < right) {
        //     int mid = (left + right) / 2, total = 0;
        //     for (int p : piles) total += (p + mid - 1) / mid;
        //     if (total > H) left = mid + 1; else right = mid;
        // }
        // return left;
    
        int lo = 1;
        int hi = piles[0];
        for(int i :piles)
            hi = Math.max(hi, i);
        while(lo<hi)
        {
            int mid = (lo+hi)/2, total = 0;
            for(int p : piles)
                total += (p+mid-1)/mid;
            if(total>H)
                lo = mid+1;
            else
                hi = mid;
        }
    return lo;
    }
}