class Solution {
    public int minOperations(int n) {
        int each = 0; 
        if(n%2 == 0)
            each = n;
        else
            each = n+1/2;
        int count = 0, i = 1;
        while(i<each)
        {
            count += each - i;
            i+=2;
        }
        return count;
    }
}