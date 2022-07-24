class Solution {
    public int xorOperation(int n, int start) {
        int res = 0;
        for(int i = 0; i<n; i++)
        {
            int ele = start + (i<<1);
            res ^= ele;
        }
        return res;
    }
}