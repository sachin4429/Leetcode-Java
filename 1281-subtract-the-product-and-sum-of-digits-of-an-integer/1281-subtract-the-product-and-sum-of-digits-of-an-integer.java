class Solution {
    public int subtractProductAndSum(int n) {
        if(n < 0)
            n = n-1;
        else if(n == 0)
            return 0;
        int sum = 0, prod = 1;
        while(n != 0)
        {
            int r = n%10;
            sum += r;
            prod *= r;
            n = n/10;
        }
        return prod - sum;
    }
}