class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int ans = numsDivide[0];
        for(int i : numsDivide)
        {
            ans = gcd(ans, i);
        }
        Arrays.sort(nums);
        int count = 0;
        for(int i : nums)
        {
            if(ans%i == 0)
                return count;
            count++;
        }
        return -1;    
    }
    int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
}