class Solution {
    public int concatenatedBinary(int n) {
        int mod = (int)(1e9 + 7);
        long res = 0;
        for (int i = 1; i <= n; i++) {
            int bitLen = (int)(Math.log(i) / Math.log(2)) + 1;
            res = ((res << bitLen) + i) % mod;
        }
        return (int)res;
    }
}