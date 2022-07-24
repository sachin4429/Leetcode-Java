class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0)
            return 1;
        int bitcount = 0, num = n;
        while(n != 0)
        {
            n = n>>1;
            bitcount++;
        }
        int largest = (int)Math.pow(2,bitcount)-1;
        return largest^num;
    }
}