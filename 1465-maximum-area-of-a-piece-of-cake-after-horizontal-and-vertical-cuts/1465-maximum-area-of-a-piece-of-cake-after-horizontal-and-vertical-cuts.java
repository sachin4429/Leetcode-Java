class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        Arrays.sort(hc);
        Arrays.sort(vc);
        long Maxc = 0;
        int prev = 0;
        for(int i : hc)
        {
            if(Maxc<i-prev)
                Maxc = i-prev;
            prev = i;
        }
        if(Maxc<h-prev)
                Maxc = h-prev;
        long Maxv = 0;
        prev = 0;
        for(int i : vc)
        {
            if(Maxv<i-prev)
                Maxv = i-prev;
            prev = i;
        }
        if(Maxv<w-prev)
                Maxv = w-prev;
        long M = 1000000007;
        long res = Maxc*Maxv%M;
        return (int)res;
    }
}