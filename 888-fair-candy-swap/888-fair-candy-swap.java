class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int sa = 0, sb = 0;
        for(int i: a)
            sa += i;
        for(int i: b)
            sb += i;
        int dif = (sa - sb) / 2;
        int lo = 0, hi = b.length-1;
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < b.length; j++) 
            {
                if (a[i] - b[j] == dif)
                    return new int[]{a[i], b[j]};
            }
        }
        return null;
    }
}