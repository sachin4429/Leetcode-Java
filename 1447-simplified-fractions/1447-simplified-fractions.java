class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<>();
        if(n == 0)
            return res;
        int nume = 1, denom = 2;
        for(nume = 1; nume<n; nume++)
        {
            for(denom = nume+1; denom<=n; denom++)
            {
                if(nume%denom != 0 && gcd(nume, denom) == 1)
                    res.add(nume+"/"+denom);
            }
        }
        return res;
    }
    int gcd(int a, int b)
    {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}