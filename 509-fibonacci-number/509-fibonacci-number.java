class Solution {
    static int [] t = new int[31];
    public int fib(int n) {
        t[0] = 0;
        t[1] = 1;
        if(n == 0 || t[n] != 0)
            return t[n];
        else
        {
            t[n] = fib(n-1) + fib(n-2);
            return t[n];
        }
    }
}