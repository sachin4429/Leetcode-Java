class Solution {
    public int trailingZeroes(int n) {
    if (n < 0) // Negative Number Edge Case
    return -1;
 
    // Initialize result
    int count = 0;
 
    // Keep dividing n by powers of
    // 5 and update count
    for (int i = 5; n / i >= 1; i *= 5)
        count += n / i;
 
    return count;
    }
}