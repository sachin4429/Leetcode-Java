class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long t[] = new long[n+1];
        long mod = 1000000007;
        long pss = 0;
        long ans = 0;
        t[1] = 1;
        for(int i = 2; i<=n ; i++)
        {
            long newSS = t[Math.max(i-delay,0)];
            long fS = t[Math.max(i-forget, 0)];
            pss += (newSS - fS +mod)%mod;
            t[i] = pss;
        }
        for(int i = n-forget+1; i<=n; i++)
            ans = (ans+t[i])%mod;
        return (int)ans;
    }
}