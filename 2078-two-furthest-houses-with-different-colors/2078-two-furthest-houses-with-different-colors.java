class Solution {
    public int maxDistance(int[] colors) {
        int lo = 0, hi = colors.length-1;
        int lres = 0, rres = 0;
        while(lo < hi)
        {
            if(colors[lo] != colors[hi])
            {
                lres = hi-lo;
                break;
            }
            else
                lo++;
        }
        lo = 0; hi = colors.length-1;
        while(lo < hi)
        {
            if(colors[lo] != colors[hi])
            {
                rres = hi-lo;
                break;
            }
            else
                hi--;
        }
        return Math.max(lres,rres);
    }
}