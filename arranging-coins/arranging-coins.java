class Solution {
    public int arrangeCoins(int n) {
        long left = 0, right = n;
        
        while (left + 1 < right) {
            long mid = left + (right - left) / 2;
            long level = (mid * (mid + 1)) / 2;
            
            if (level == n) {
                return (int) mid;
            } else if (level < n) {
                left = mid;
            } else {
                right = mid;
            }
        }
        
        if ((right * (right + 1) / 2) == n) {
            return (int)right;
        }
        
        return (int)left;
    }
}

// O(lgN)