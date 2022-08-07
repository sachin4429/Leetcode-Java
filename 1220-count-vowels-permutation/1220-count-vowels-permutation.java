class Solution {
    public int countVowelPermutation(int n) {
        long MOD = 1000000000+7;
        long a = 1, e = 1, i = 1, o = 1, u = 1, a_new = 0, e_new = 0, i_new = 0, o_new = 0, u_new = 0;
        for(int j = 2; j <= n; j++) 
        {
            a_new =  e;
            e_new = (a + i) % MOD;
            i_new = (a + e + o + u) % MOD;
            o_new = (i + u) % MOD;
            u_new =  a;
            a = a_new; e = e_new; i = i_new; o = o_new; u = u_new;
        }
        return (int)((a + e + i + o + u) % MOD);
    }
}